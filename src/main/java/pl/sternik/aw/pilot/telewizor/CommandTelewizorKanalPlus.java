package pl.sternik.aw.pilot.telewizor;

import pl.sternik.aw.pilot.commands.Command;

public class CommandTelewizorKanalPlus implements Command {
    public void execute() {
        Telewizor.instance().kanalPlus();
    }

    public String getOpis() {
        return "Przełączam kanał";
    }
}
