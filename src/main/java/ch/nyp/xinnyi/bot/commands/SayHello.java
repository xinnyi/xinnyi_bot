package ch.nyp.xinnyi.bot.commands;

import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.core.ExtendedCommand;

public class SayHello extends ExtendedCommand {


    private TelegramService telegramService;

    public SayHello(long chatId, long userId, TelegramService telegramService) {
        super(chatId, userId);
        this.telegramService = telegramService;
    }

    @Override
    public void execute() {
        telegramService.sendText("Hello", chatId);
    }

}
