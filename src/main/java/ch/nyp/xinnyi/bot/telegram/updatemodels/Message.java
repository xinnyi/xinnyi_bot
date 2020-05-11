package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Message  {
    private String message_id;
    private User from;
    private User forward_from;
    private Chat chat;
    private int date;
    private int forward_date;
    private String text;
    private Entity[] entities;
    private Photo[] photo;
    private Voice voice;
    private Document document;
    private Message reply_to_message;


    public String getMessage_id() {
        return message_id;
    }

    public Message setMessage_id(String message_id) {
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

    public int getDate() {
        return date;
    }

    public Message setDate(int date) {
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

    public User getForward_from() {
        return forward_from;
    }

    public Message setForward_from(User forward_from) {
        this.forward_from = forward_from;
        return this;
    }

    public int getForward_date() {
        return forward_date;
    }

    public Message setForward_date(int forward_date) {
        this.forward_date = forward_date;
        return this;
    }

    public Entity[] getEntities() {
        return entities;
    }

    public Message setEntities(Entity[] entities) {
        this.entities = entities;
        return this;
    }

    public Photo[] getPhoto() {
        return photo;
    }

    public Message setPhoto(Photo[] photo) {
        this.photo = photo;
        return this;
    }

    public Voice getVoice() {
        return voice;
    }

    public Message setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    public Document getDocument() {
        return document;
    }

    public Message setDocument(Document document) {
        this.document = document;
        return this;
    }

    public Message getReply_to_message() {
        return reply_to_message;
    }

    public Message setReply_to_message(Message reply_to_message) {
        this.reply_to_message = reply_to_message;
        return this;
    }
}
