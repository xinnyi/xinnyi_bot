package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.bot.telegram.updatemodels.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class BotController {

    private BotService botService;
    private TelegramService telegramService;

    @Autowired
    public BotController(BotService botService, TelegramService telegramService) {
        this.telegramService = telegramService;
        this.botService = botService;
    }

    @PostMapping
    public ResponseEntity<Void> newMessage(@RequestBody Update update) {
        botService.handleNewMessageUpdate(update);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }



}
