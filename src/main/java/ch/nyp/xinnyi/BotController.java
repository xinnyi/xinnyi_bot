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
    private TelegramService telegramService;
    private APIService apiService;

    @Autowired
    public BotController(CommandService commandService, TelegramService telegramService, APIService apiService){
        this.telegramService = telegramService;
        this.commandService = commandService;
        this.apiService = apiService;
    }

    @PostMapping
    public ResponseEntity<Void> newMessage(@RequestBody NewMessageUpdate update) throws IOException {
        Command command = commandService.parseCommand(update);
        if (command !=  null) {
            telegramService.sendText(command.getResponseText(), update.getMessage().getChat().getId());
        }else{
            telegramService.sendText(update.getMessage().getText(),update.getMessage().getChat().getId());
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
