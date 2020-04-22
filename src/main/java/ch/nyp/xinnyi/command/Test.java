package ch.nyp.xinnyi.command;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test implements Command{
    @Override public String getResponseText() {
        try {
            return URLEncoder.encode("https://noatest.noseryoung.ch", "UTF-8");
        } catch ( UnsupportedEncodingException e) {
            return "command error";
        }
    }
}
