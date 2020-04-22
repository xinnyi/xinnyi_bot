package ch.nyp.xinnyi.bot.telegram.commands;

import ch.nyp.xinnyi.bot.api.APIService;
import ch.nyp.xinnyi.core.ExtendedCommand;
import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.error.BadRequestException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ListUsers extends ExtendedCommand {

    private APIService apiService;

    public ListUsers(TelegramService telegramService,long chatId, APIService apiService) {
        super(telegramService, chatId);
        this.apiService = apiService;
    }

    @Override
    public void execute() {
        try {
            telegramService.sendText(URLEncoder.encode(apiService.getUsers(), "UTF-8"), chatId);
        } catch (BadRequestException | UnsupportedEncodingException e) {
            telegramService.sendText("command error", chatId);
        }
    }
}
