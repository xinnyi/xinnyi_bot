package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.bot.api.APIService;
import ch.nyp.xinnyi.bot.commands.ListUsers;
import ch.nyp.xinnyi.bot.commands.SayHello;
import ch.nyp.xinnyi.bot.commands.Test;
import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.bot.telegram.updatemodels.NewMessageUpdate;
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

    public void handleNewMessageUpdate(NewMessageUpdate update) {
        ExtendedCommand command = parseCommand(update);
        if (command != null) {
            command.execute();
        }
    }


    public ExtendedCommand parseCommand(NewMessageUpdate update) {
        String text = update.getMessage().getText();
        long chatId = update.getMessage().getChat().getId();
        long userId = update.getMessage().getFrom().getId();


        if (text.equalsIgnoreCase("/say hello")) {
            return new SayHello(chatId, userId, telegramService);
        } else if (text.equalsIgnoreCase("/list users")) {
            return new ListUsers(chatId, userId, telegramService, apiService);
        } else if (text.equalsIgnoreCase("/test")) {
            return new Test(chatId, userId, telegramService);
        }
        return null;
    }
}
