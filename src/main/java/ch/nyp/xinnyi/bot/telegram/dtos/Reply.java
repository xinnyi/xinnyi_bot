package ch.nyp.xinnyi.bot.telegram.dtos;

import ch.nyp.xinnyi.core.ExtendedDTO;


public class Reply implements ExtendedDTO {
    private String chat_id;
    private String message_id;
    private String inline_message_id;
    private String text;
    private String parse_mode = "html";
    private boolean disable_web_page_preview;
    private boolean disable_notification;
    private boolean reply_to_message_id;
    private ReplayMarkup reply_markup;

    public Reply(String chat_id, String text) {
        this.chat_id = chat_id;
        this.text = text;
    }

    public Reply(String chat_id, String text, ReplayMarkup reply_markup) {
        this.chat_id = chat_id;
        this.text = text;
        this.reply_markup = reply_markup;
    }

    public Reply(String chat_id, String message_id, String text, ReplayMarkup reply_markup) {
        this.chat_id = chat_id;
        this.message_id = message_id;
        this.text = text;
        this.reply_markup = reply_markup;
    }

    public String getText() {
        return text;
    }

    public Reply setText(String text) {
        this.text = text;
        return this;
    }

    public String getMessage_id() {
        return message_id;
    }

    public Reply setMessage_id(String message_id) {
        this.message_id = message_id;
        return this;
    }

    public String getInline_message_id() {
        return inline_message_id;
    }

    public Reply setInline_message_id(String inline_message_id) {
        this.inline_message_id = inline_message_id;
        return this;
    }

    public ReplayMarkup getInlineKeyboard() {
        return reply_markup;
    }

    public Reply setInlineKeyboard(ReplayMarkup inlineKeyboard) {
        this.reply_markup = inlineKeyboard;
        return this;
    }

    public String getChat_id() {
        return chat_id;
    }

    public Reply setChat_id(String chat_id) {
        this.chat_id = chat_id;
        return this;
    }

    public String getParse_mode() {
        return parse_mode;
    }

    public Reply setParse_mode(String parse_mode) {
        this.parse_mode = parse_mode;
        return this;
    }

    public boolean isDisable_web_page_preview() {
        return disable_web_page_preview;
    }

    public Reply setDisable_web_page_preview(boolean disable_web_page_preview) {
        this.disable_web_page_preview = disable_web_page_preview;
        return this;
    }

    public boolean isDisable_notification() {
        return disable_notification;
    }

    public Reply setDisable_notification(boolean disable_notification) {
        this.disable_notification = disable_notification;
        return this;
    }

    public boolean isReply_to_message_id() {
        return reply_to_message_id;
    }

    public Reply setReply_to_message_id(boolean reply_to_message_id) {
        this.reply_to_message_id = reply_to_message_id;
        return this;
    }

    public ReplayMarkup getReply_markup() {
        return reply_markup;
    }

    public Reply setReply_markup(ReplayMarkup reply_markup) {
        this.reply_markup = reply_markup;
        return this;
    }
}
