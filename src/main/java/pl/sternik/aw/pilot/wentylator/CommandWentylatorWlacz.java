package pl.sternik.aw.pilot.wentylator;

import pl.sternik.aw.pilot.commands.Command;

public class CommandWentylatorWlacz implements Command {
    public void execute() {
        Wentylator.instance().wlacz();
    }

    public String getOpis() {
        return "Włącz Wentylator";
    }
}
