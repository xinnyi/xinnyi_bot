package ch.nyp.xinnyi;

import ch.nyp.xinnyi.command.Command;
import ch.nyp.xinnyi.command.ListUsers;
import ch.nyp.xinnyi.command.SayHello;
import ch.nyp.xinnyi.command.Test;
import ch.nyp.xinnyi.dto.update.NewMessageUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommandServiceImpl implements CommandService {


    private APIService apiService;

    @Autowired
    public CommandServiceImpl(APIService apiService) {
        this.apiService = apiService;
    }


    public Command parseCommand(NewMessageUpdate update) {

        String text = update.getMessage().getText();

        if (text.equals("/say hello")) {
            return new SayHello();
        } else if (text.equals("/list users")) {
            return new ListUsers(apiService);
        }else if(text.equals("/test")){
            return new Test();
        }
        return null;
    }
}
