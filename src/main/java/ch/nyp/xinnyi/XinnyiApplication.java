package ch.nyp.xinnyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XinnyiApplication {


    public static final String token = "1193276515:AAHmE7__O7n-2s5pXZ-GB4P4Y58cgZ9QrEQ";

    public static void main(String[] args) {

        // setWebhook
        // https://api.telegram.org/bot{{bot_token}}/setWebhook?url={{url}}

        SpringApplication.run(XinnyiApplication.class, args);
    }

}
