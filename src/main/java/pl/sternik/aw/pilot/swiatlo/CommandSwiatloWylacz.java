package pl.sternik.aw.pilot.swiatlo;

import pl.sternik.aw.pilot.commands.Command;

public class CommandSwiatloWylacz implements Command {
    public void execute() {
        Swiatlo.instance().wylacz();
    }

    public String getOpis() {
        return "Wyłącz światło";
    }
}
