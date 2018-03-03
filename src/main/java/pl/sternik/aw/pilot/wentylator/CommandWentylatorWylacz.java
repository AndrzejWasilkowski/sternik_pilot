package pl.sternik.aw.pilot.wentylator;

import pl.sternik.aw.pilot.commands.Command;

public class CommandWentylatorWylacz implements Command {
    public void execute() {
        Wentylator.instance().wylacz();
    }

    public String getOpis() {
        return "Wyłącz wentylator";
    }
}
