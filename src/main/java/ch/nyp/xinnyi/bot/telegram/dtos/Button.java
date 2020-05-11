package ch.nyp.xinnyi.bot.telegram.dtos;

import ch.nyp.xinnyi.core.ExtendedDTO;


public class Button implements ExtendedDTO {

    private String text;
    private String url;
    private String callback_data;

    public Button(String text) {
        this.text = text;
    }

    public Button(String text, String url, String callback_data) {
        this.text = text;
        this.url = url;
        this.callback_data = callback_data;
    }

    public String getText() {
        return text;
    }

    public Button setText(String text) {
        this.text = text;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Button setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCallback_data() {
        return callback_data;
    }

    public Button setCallback_data(String callback_data) {
        this.callback_data = callback_data;
        return this;
    }
}
