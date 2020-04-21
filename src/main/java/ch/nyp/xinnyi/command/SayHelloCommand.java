package ch.nyp.xinnyi.command;

public class SayHelloCommand implements Command{
    @Override public String getResponseText() {
        return "Hello";
    }
}
