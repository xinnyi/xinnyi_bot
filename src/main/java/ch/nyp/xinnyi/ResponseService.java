package ch.nyp.xinnyi;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class ResponseService {


    public void sendTextResponse(String text, long chatid) {
        try {
            URL url = new URL("https://api.telegram.org/bot" + XinnyiApplication.token + "/sendMessage?chat_id=" + chatid + "&text=" + text);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("responded to "+chatid +" with \""+text+"\"");
            } else {
                System.out.println("POST request failed");
            }
            con.disconnect();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
