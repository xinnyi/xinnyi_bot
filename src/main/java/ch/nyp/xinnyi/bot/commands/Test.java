package ch.nyp.xinnyi.bot.commands;


import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.core.ExtendedCommand;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test extends ExtendedCommand {

    private TelegramService telegramService;

    public Test(long chatId, long userId, TelegramService telegramService) {
        super( chatId, userId);
        this.telegramService = telegramService;

    }

    @Override
    public void execute() {
        try {
            telegramService.sendHtml(URLEncoder.encode("<p>https://noatest.noseryoung.ch</p>", "UTF-8"), chatId);
        } catch (UnsupportedEncodingException e) {
            telegramService.sendText("command error", chatId);
        }
    }

}
