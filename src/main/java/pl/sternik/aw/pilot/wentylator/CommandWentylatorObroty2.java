package pl.sternik.aw.pilot.wentylator;

import pl.sternik.aw.pilot.commands.Command;

public class CommandWentylatorObroty2 implements Command {
    public void execute() {
        Wentylator.instance().obroty2();
    }

    public String getOpis() {
        return "Ustaw obroty na 2";
    }
}
