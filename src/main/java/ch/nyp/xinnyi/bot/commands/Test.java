package ch.nyp.xinnyi.bot.commands;


import ch.nyp.xinnyi.bot.telegram.TelegramService;
import ch.nyp.xinnyi.bot.telegram.dtos.Button;
import ch.nyp.xinnyi.bot.telegram.dtos.ReplayMarkup;
import ch.nyp.xinnyi.core.ExtendedCommand;

import java.util.ArrayList;
import java.util.List;


public class Test extends ExtendedCommand {

    private TelegramService telegramService;

    public Test(String chatId, String userId, TelegramService telegramService) {
        super(chatId, userId);
        this.telegramService = telegramService;
    }

    @Override
    public void execute() {

        List<List<Button>> rows = new ArrayList<>();
        List<Button> row1 = new ArrayList<>();
        row1.add(new Button("yes",null,"yes"));
        row1.add(new Button("no",null,"no"));
        rows.add(row1);

        telegramService.sendReply(chatId,"Do you like buttons?",  new ReplayMarkup(rows));
    }

}
