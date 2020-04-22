package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.bot.api.APIService;
import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.core.ExtendedCommand;
import ch.nyp.xinnyi.bot.telegram.commands.ListUsers;
import ch.nyp.xinnyi.bot.telegram.commands.SayHello;
import ch.nyp.xinnyi.bot.telegram.commands.Test;
import ch.nyp.xinnyi.bot.telegram.updatemodels.NewMessageUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BotServiceImpl implements BotService {

    private APIService apiService;
    private TelegramService telegramService;

    @Autowired
    public BotServiceImpl(APIService apiService, TelegramService telegramService) {
        this.apiService = apiService;this.telegramService = telegramService;
    }


    public ExtendedCommand parseCommand(NewMessageUpdate update) {

        String text = update.getMessage().getText();
        long chatId = update.getMessage().getChat().getId();

        if (text.equalsIgnoreCase("/say hello")) {
            return new SayHello(telegramService, chatId);
        } else if (text.equalsIgnoreCase("/list users")) {
            return new ListUsers(telegramService, chatId, apiService);
        }else if(text.equalsIgnoreCase("/test")){
            return new Test(telegramService, chatId);
        }
        return null;
    }
}
