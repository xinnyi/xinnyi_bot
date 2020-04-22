package ch.nyp.xinnyi.bot.telegram.commands;


import ch.nyp.xinnyi.core.ExtendedCommand;
import ch.nyp.xinnyi.bot.telegram.TelegramService;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test extends ExtendedCommand {

    public Test(TelegramService telegramService, long chatId) {
        super(telegramService, chatId);
    }

    @Override public void execute() {
        try {
            telegramService.sendText(URLEncoder.encode("https://noatest.noseryoung.ch", "UTF-8"), chatId);
        } catch (UnsupportedEncodingException e) {
            telegramService.sendText("command error", chatId);
        }
    }
}
