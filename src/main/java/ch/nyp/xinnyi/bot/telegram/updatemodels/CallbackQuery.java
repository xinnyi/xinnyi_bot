package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class CallbackQuery {
    private String id;
    private User from;
    private Message message;
    private String chat_instance;
    private String data;

    public CallbackQuery() {
    }

    public String getId() {
        return id;
    }

    public CallbackQuery setId(String id) {
        this.id = id;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public CallbackQuery setFrom(User from) {
        this.from = from;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public CallbackQuery setMessage(Message message) {
        this.message = message;
        return this;
    }

    public String getChat_instance() {
        return chat_instance;
    }

    public CallbackQuery setChat_instance(String chat_instance) {
        this.chat_instance = chat_instance;
        return this;
    }

    public String getData() {
        return data;
    }

    public CallbackQuery setData(String data) {
        this.data = data;
        return this;
    }
}
