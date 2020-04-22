package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class EditedMessageUpdate extends Update {

    private Message edited_message;

    public Message getEdited_message() {
        return edited_message;
    }

    public EditedMessageUpdate setEdited_message(Message edited_message) {
        this.edited_message = edited_message;
        return this;
    }
}
