package pl.sternik.aw.pilot.garaz;

import pl.sternik.aw.pilot.commands.Command;

public class CommandGarazDrzwiGora implements Command {
    public void execute() {
        Garaz.instance().drzwiGora();
    }

    public String getOpis() {
        return "Otwórz drzwi";
    }
}
