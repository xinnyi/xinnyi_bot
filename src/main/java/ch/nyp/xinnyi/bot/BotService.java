package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.bot.telegram.updatemodels.Update;
import ch.nyp.xinnyi.core.ExtendedCommand;

public interface BotService {

    ExtendedCommand parseCommand(Update update);

    void handleNewMessageUpdate(Update update);


}
