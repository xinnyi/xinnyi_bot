package ch.nyp.xinnyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XinnyiApplication {

    public static final String TOKEN = "1193276515:AAHmE7__O7n-2s5pXZ-GB4P4Y58cgZ9QrEQ";
    public static final String BOT_URL = "https://363411e3.ngrok.io";
    public static final String API_URL = "https://xinnyi.herokuapp.com";
    public static final String API_USERNAME = "john.doe@noseryoung.ch";
    public static final String API_PASSWORD = "12345";

    public static void main(String[] args) {
        SpringApplication.run(XinnyiApplication.class, args);
    }

}
