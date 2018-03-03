package pl.sternik.aw.pilot.telewizor;

import pl.sternik.aw.pilot.commands.Command;

public class CommandTelewizorWylacz implements Command {
    public void execute() {
        Telewizor.instance().wylacz();
    }

    public String getOpis() {
        return "Wyłączono telewizor";
    }
}
