package ch.nyp.xinnyi;

public interface TelegramService {

    boolean sendText(String text, long chatId);

    boolean setWebHook();

}
