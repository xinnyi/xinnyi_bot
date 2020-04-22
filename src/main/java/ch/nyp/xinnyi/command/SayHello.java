package ch.nyp.xinnyi.command;

public class SayHello implements Command{
    @Override public String getResponseText() {
        return "Hello there";
    }
}
