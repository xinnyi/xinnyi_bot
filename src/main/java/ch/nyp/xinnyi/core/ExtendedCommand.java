package ch.nyp.xinnyi.core;


import ch.nyp.xinnyi.bot.telegram.TelegramService;

public abstract class ExtendedCommand {

    protected TelegramService telegramService;
    protected long chatId;

    public ExtendedCommand(TelegramService telegramService, long chatId){
        this.telegramService = telegramService;
        this.chatId = chatId;
    }


    public abstract void execute();

}
