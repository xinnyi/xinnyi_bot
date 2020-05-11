package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.bot.api.APIService;
import ch.nyp.xinnyi.bot.commands.ListUsers;
import ch.nyp.xinnyi.bot.commands.Test;
import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.bot.telegram.updatemodels.Update;
import ch.nyp.xinnyi.core.ExtendedCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BotServiceImpl implements BotService {

    private APIService apiService;
    private TelegramService telegramService;

    @Autowired
    public BotServiceImpl(APIService apiService, TelegramService telegramService) {
        this.apiService = apiService;
        this.telegramService = telegramService;
    }

    public void handleNewMessageUpdate(Update update) {
        ExtendedCommand command = parseCommand(update);
        if (command != null) {
            command.execute();
        }
    }


    public ExtendedCommand parseCommand(Update update) {
        if (update.getMessage() != null) {
            if (update.getMessage().getText() != null) {
                String text = update.getMessage().getText();
                String chatId = update.getMessage().getChat().getId();
                String userId = update.getMessage().getFrom().getId();


                if (text.equalsIgnoreCase("/list users")) {
                    return new ListUsers(chatId, userId, telegramService, apiService);
                } else if (text.equalsIgnoreCase("/test")) {
                    return new Test(chatId, userId, telegramService);
                }
            }
        } else if (update.getCallback_query() != null) {
            String chatId = update.getCallback_query().getMessage().getChat().getId();
            String messageId =update.getCallback_query().getMessage().getMessage_id();
            telegramService.updateReply(chatId, messageId,update.getCallback_query().getData().equals("yes") ? "Nice" : "Ouf");
        }
        return null;
    }
}
