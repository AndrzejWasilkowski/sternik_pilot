package pl.sternik.aw.pilot.wentylator;

import pl.sternik.aw.pilot.commands.Command;

public class CommandWentylatorObroty3 implements Command {
    public void execute() {
        Wentylator.instance().obroty3();
    }

    public String getOpis() {
        return "Ustaw obroty na 3";
    }
}
