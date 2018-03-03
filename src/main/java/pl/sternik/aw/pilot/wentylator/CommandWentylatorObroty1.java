package pl.sternik.aw.pilot.wentylator;

import pl.sternik.aw.pilot.commands.Command;

public class CommandWentylatorObroty1 implements Command {
    public void execute() {
        Wentylator.instance().obroty1();
    }

    public String getOpis() {
        return "Ustaw obroty 1";
    }
}
