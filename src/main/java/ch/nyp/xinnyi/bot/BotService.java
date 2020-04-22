package ch.nyp.xinnyi.bot;

import ch.nyp.xinnyi.core.ExtendedCommand;
import ch.nyp.xinnyi.bot.telegram.updatemodels.NewMessageUpdate;

public interface BotService {

    ExtendedCommand parseCommand(NewMessageUpdate update);
}
