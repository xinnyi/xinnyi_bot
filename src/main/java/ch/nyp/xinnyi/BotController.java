package ch.nyp.xinnyi;

import ch.nyp.xinnyi.command.Command;
import ch.nyp.xinnyi.update.NewMessageUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;


@Controller
public class BotController {

    private CommandService commandService;
    private ResponseService responseService;

    @Autowired
    public BotController(CommandService commandService, ResponseService responseService){
        this.commandService = commandService;
        this.responseService = responseService;
    }

    @PostMapping
    public ResponseEntity<Void> newMessage( @RequestBody NewMessageUpdate update) {

        // parse update type

        Command command = commandService.parseCommand(update);
        if(command != null){
            responseService.sendTextResponse(command.getResponseText(), update.getMessage().getChat().getId());
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
