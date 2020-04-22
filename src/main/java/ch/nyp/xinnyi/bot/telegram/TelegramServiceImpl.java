package ch.nyp.xinnyi.bot.telegram;


import ch.nyp.xinnyi.core.HttpConnector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;


@Service
public class TelegramServiceImpl implements TelegramService {

    @Value("${xinnyi.TOKEN}")
    private String TOKEN;

    @Value("${xinnyi.BOT_URL}")
    private String BOT_URL;

    public TelegramServiceImpl() throws IOException {
        setWebHook();
    }

    private boolean setWebHook() {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + TOKEN + "/setWebhook?url=" + BOT_URL);
        System.out.println("webhook: "+response.body());
        return response.statusCode() == 200;
    }

    public boolean sendText(String text, long chatId) {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + TOKEN + "/sendMessage?chat_id=" + chatId + "&text=" + text);
        return response.statusCode() == 200;
    }
}
