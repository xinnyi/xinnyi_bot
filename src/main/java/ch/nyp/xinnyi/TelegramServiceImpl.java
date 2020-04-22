package ch.nyp.xinnyi;


import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;


@Service
public class TelegramServiceImpl implements TelegramService {

    public TelegramServiceImpl() throws IOException {
        setWebHook();
    }

    public boolean sendText(String text, long chatId) {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + XinnyiApplication.TOKEN + "/sendMessage?chat_id=" + chatId + "&text=" + text);
        return response.statusCode() == 200;
    }

    public boolean setWebHook() {
        HttpResponse response = HttpConnector.post("https://api.telegram.org/bot" + XinnyiApplication.TOKEN + "/setWebhook?url=" + XinnyiApplication.BOT_URL);
        System.out.println("webhook: "+response.body());
        return response.statusCode() == 200;
    }
}
