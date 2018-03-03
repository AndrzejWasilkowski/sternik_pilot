package pl.sternik.aw.pilot.telewizor;

import pl.sternik.aw.pilot.commands.Command;

public class CommandTelewizorWlacz implements Command {
    public void execute() {
        Telewizor.instance().wlacz();
    }

    public String getOpis() {
        return "Włączono telewizor";
    }
}
