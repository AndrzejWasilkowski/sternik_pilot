package pl.sternik.aw.pilot.swiatlo;

import pl.sternik.aw.pilot.commands.Command;

public class CommandSwiatloWlacz implements Command {

    public void execute() {
        Swiatlo.instance().wlacz();
    }

    public String getOpis() {
        return "Włącz światło";
    }
}
