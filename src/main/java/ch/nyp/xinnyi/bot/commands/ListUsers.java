package ch.nyp.xinnyi.bot.commands;

import ch.nyp.xinnyi.bot.api.APIService;
import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.core.ExtendedCommand;
import ch.nyp.xinnyi.error.BadRequestException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ListUsers extends ExtendedCommand {

    private APIService apiService;
    private TelegramService telegramService;

    public ListUsers(String chatId, String userId, TelegramService telegramService, APIService apiService) {
        super(chatId,userId);
        this.apiService = apiService;
        this.telegramService = telegramService;
    }

    @Override
    public void execute() {
        try {
            telegramService.sendReply(URLEncoder.encode(apiService.getUsers(userId), "UTF-8"), chatId);
        } catch (BadRequestException | UnsupportedEncodingException e) {
            telegramService.sendReply("command error", chatId);
        }
    }

}
