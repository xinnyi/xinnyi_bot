package ch.nyp.xinnyi;

import ch.nyp.xinnyi.command.Command;
import ch.nyp.xinnyi.command.SayHelloCommand;
import ch.nyp.xinnyi.update.NewMessageUpdate;
import org.springframework.stereotype.Service;


@Service
public class CommandServiceImpl implements CommandService{


    public  Command parseCommand(NewMessageUpdate update){
        if(update.getMessage().getText().startsWith("/hello")){
            return new SayHelloCommand();
        }
        return null;
    }
}
