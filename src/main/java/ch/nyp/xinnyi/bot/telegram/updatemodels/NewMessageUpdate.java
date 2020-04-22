package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class NewMessageUpdate extends Update  {

    private Message message;

    public Message getMessage() {
        return message;
    }

    public Update setMessage(Message message) {
        this.message = message;
        return this;
    }
}
