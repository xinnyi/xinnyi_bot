package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.bot.telegram.updatemodels.NewMessageUpdate;
import ch.nyp.xinnyi.core.ExtendedCommand;

public interface BotService {

    ExtendedCommand parseCommand(NewMessageUpdate update);

    void handleNewMessageUpdate(NewMessageUpdate update);


}
