package pl.sternik.aw.pilot.telewizor;

import pl.sternik.aw.pilot.commands.Command;

public class CommandTelewizorKanalMinus implements Command {
    public void execute() {
        Telewizor.instance().kanalMinus();
    }

    public String getOpis() {
        return "Przełaczam kanał";
    }
}
