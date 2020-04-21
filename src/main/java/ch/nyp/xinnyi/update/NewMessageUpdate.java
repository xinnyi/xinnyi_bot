package ch.nyp.xinnyi.update;

public class NewMessageUpdate extends Update {

    private Message message;

    public Message getMessage() {
        return message;
    }

    public Update setMessage(Message message) {
        this.message = message;
        return this;
    }
}
