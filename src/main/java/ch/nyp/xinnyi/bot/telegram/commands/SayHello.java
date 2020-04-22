package ch.nyp.xinnyi.bot.telegram.commands;

import ch.nyp.xinnyi.core.ExtendedCommand;
import ch.nyp.xinnyi.bot.telegram.TelegramService;

public class SayHello extends ExtendedCommand {

    public SayHello(TelegramService telegramService, long chatId) {
        super(telegramService, chatId);
    }

    @Override public void execute() {
        telegramService.sendText("Hello there", chatId);
    }
}
