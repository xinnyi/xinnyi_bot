package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Update {

    private String update_id;
    private Message edited_message;
    private Message message;
    private CallbackQuery callback_query;


    public String getUpdate_id() {
        return update_id;
    }

    public Update setUpdate_id(String update_id) {
        this.update_id = update_id;
        return this;
    }

    public Message getEdited_message() {
        return edited_message;
    }

    public Update setEdited_message(Message edited_message) {
        this.edited_message = edited_message;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public Update setMessage(Message message) {
        this.message = message;
        return this;
    }

    public CallbackQuery getCallback_query() {
        return callback_query;
    }

    public Update setCallback_query(CallbackQuery callback_query) {
        this.callback_query = callback_query;
        return this;
    }
}
