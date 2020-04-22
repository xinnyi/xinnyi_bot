package ch.nyp.xinnyi.bot.telegram;


import ch.nyp.xinnyi.core.HttpConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;


@Service
public class TelegramServiceImpl implements TelegramService {

    private Logger logger = LoggerFactory.getLogger(TelegramServiceImpl.class);
    private Environment environment;

    public TelegramServiceImpl(Environment environment) {
        this.environment = environment;

        setWebHook();
    }

    private boolean setWebHook() {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + environment.getProperty("xinnyi.TOKEN") + "/setWebhook?url=" + environment.getProperty("xinnyi.BOT_URL"));
        if (response.statusCode() == 200) {
            logger.info("Webhook set");
            return true;
        } else {
            logger.error("Could not setup webhook");
            return false;
        }
    }

    public boolean sendText(String text, long chatId) {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + environment.getProperty("xinnyi.TOKEN")  + "/sendMessage?chat_id=" + chatId + "&text=" + text);
        return response.statusCode() == 200;
    }
}
