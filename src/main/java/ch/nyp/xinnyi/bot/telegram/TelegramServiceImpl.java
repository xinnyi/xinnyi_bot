package ch.nyp.xinnyi.bot.telegram;


import ch.nyp.xinnyi.bot.telegram.dtos.ReplayMarkup;
import ch.nyp.xinnyi.bot.telegram.dtos.Reply;
import ch.nyp.xinnyi.core.HttpConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;


@Service
public class TelegramServiceImpl implements TelegramService {

    private Logger logger = LoggerFactory.getLogger(TelegramServiceImpl.class);
    private Environment environment;

    @Autowired
    public TelegramServiceImpl(Environment environment) {
        this.environment = environment;
        setWebHook();
    }

    private void setWebHook() {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + environment.getProperty("xinnyi.TOKEN") + "/setWebhook?url=" + environment.getProperty("xinnyi.BOT_URL"));
        if (response.statusCode() == 200) {
            logger.info("Webhook set");
        } else {
            logger.error("Could not setup webhook");
        }
    }


    @Override
    public void sendReply(String chatId, String text) {
        sendReply(chatId, text, null);
    }


    @Override
    public void sendReply(String chatId, String text, ReplayMarkup replayMarkup) {
        int maxlength = Integer.parseInt(environment.getProperty("telegram.message.maxlength"));
        int start = 0;
        while (start < text.length()) {
            int endMax = Math.min(start + maxlength, text.length());
            int end = endMax;
            if (end < text.length()) {
                while (end > start) {
                    if (text.charAt(end) == ' ' || text.startsWith("\r\n", end - 4)) { // space or line feed
                        break;
                    }
                    end--;
                }
            }
            // no space or line feed found
            if (end <= start) {
                end = endMax;
            }

            // send replayMarkups only once after text
            if (end == text.length()) {
                HttpConnector.post("https://api.telegram.org/bot" + environment.getProperty("xinnyi.TOKEN") + "/sendMessage",
                        new Reply(chatId, text.substring(start, end), replayMarkup));
            } else {
                HttpConnector.post("https://api.telegram.org/bot" + environment.getProperty("xinnyi.TOKEN") + "/sendMessage",
                        new Reply(chatId, text.substring(start, end)));
            }
            start = end + 1;
        }
    }

    @Override public void updateReply(String chatId, String messageId, String text) {
        updateReply(chatId, messageId, text, null);
    }

    @Override public void updateReply(String chatId, String messageId, String text, ReplayMarkup replayMarkup) {
        HttpConnector.post("https://api.telegram.org/bot" + environment.getProperty("xinnyi.TOKEN") + "/editMessageText", new Reply(chatId, messageId, text, replayMarkup));
    }


    // download file
    // https://api.telegram.org/bot<token>/getFile?file_id=<file_id>
    // https://api.telegram.org/file/bot<token>/<file_path>
}
