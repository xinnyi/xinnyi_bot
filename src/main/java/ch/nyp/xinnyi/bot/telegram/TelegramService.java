package ch.nyp.xinnyi.bot.telegram;

import ch.nyp.xinnyi.bot.telegram.dtos.ReplayMarkup;


public interface TelegramService {

    void sendReply(String chatId, String text);

    void sendReply(String chatId, String text, ReplayMarkup replayMarkup);

    void updateReply(String chatId, String messageId, String text);

    void updateReply(String chatId, String messageId, String text, ReplayMarkup replayMarkup);
}
