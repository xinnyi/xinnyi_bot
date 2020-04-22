package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Message  {
    private long message_id;
    private User from;
    private Chat chat;
    private long date;
    private String text;

    public long getMessage_id() {
        return message_id;
    }

    public Message setMessage_id(long message_id) {
        this.message_id = message_id;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public Message setFrom(User from) {
        this.from = from;
        return this;
    }

    public Chat getChat() {
        return chat;
    }

    public Message setChat(Chat chat) {
        this.chat = chat;
        return this;
    }

    public long getDate() {
        return date;
    }

    public Message setDate(long date) {
        this.date = date;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }
}
