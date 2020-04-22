package ch.nyp.xinnyi;

import ch.nyp.xinnyi.command.Command;
import ch.nyp.xinnyi.dto.update.NewMessageUpdate;
import ch.nyp.xinnyi.error.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class BotController {

    private CommandService commandService;
    private TelegramService telegramService;

    @Autowired
    public BotController(CommandService commandService, TelegramService telegramService) {
        this.telegramService = telegramService;
        this.commandService = commandService;
    }

    @PostMapping
    public ResponseEntity<Void> newMessage(@RequestBody NewMessageUpdate update) {
        try {
            Command command = commandService.parseCommand(update);
            if (command != null) {
                telegramService.sendText(command.getResponseText(), update.getMessage().getChat().getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
