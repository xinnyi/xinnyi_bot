package ch.nyp.xinnyi.bot.telegram;

public interface TelegramService {

    boolean sendText(String text, long chatId);

}
