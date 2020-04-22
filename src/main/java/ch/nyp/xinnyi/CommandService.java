package ch.nyp.xinnyi;

import ch.nyp.xinnyi.command.Command;
import ch.nyp.xinnyi.update.NewMessageUpdate;

public interface CommandService {

    Command parseCommand(NewMessageUpdate update);
}
