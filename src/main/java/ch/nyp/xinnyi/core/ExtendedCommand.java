package ch.nyp.xinnyi.core;


public abstract class ExtendedCommand {

    protected long chatId, userId;

    public ExtendedCommand(long chatId, long userId){
        this.chatId = chatId;
        this.userId = userId;
}


    public abstract void execute();


}
