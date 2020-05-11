package ch.nyp.xinnyi.core;


public abstract class ExtendedCommand {

    protected String chatId, userId;

    public ExtendedCommand(String chatId, String userId){
        this.chatId = chatId;
        this.userId = userId;
}


    public abstract void execute();


}
