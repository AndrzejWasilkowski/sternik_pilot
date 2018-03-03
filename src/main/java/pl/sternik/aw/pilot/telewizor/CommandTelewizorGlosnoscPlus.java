package pl.sternik.aw.pilot.telewizor;

import pl.sternik.aw.pilot.commands.Command;

public class CommandTelewizorGlosnoscPlus implements Command {
    public void execute() {
        Telewizor.instance().glosnoscPlus();
    }

    public String getOpis() {
        return "Złaśniam";
    }
}
