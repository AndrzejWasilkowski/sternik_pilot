package pl.sternik.aw.pilot.garaz;

import pl.sternik.aw.pilot.commands.Command;

public class CommandGarazDrzwiDol implements Command {
    public void execute() {
        Garaz.instance().drzwiDol();
    }

    public String getOpis() {
        return "Zamknij drzwi";
    }
}
