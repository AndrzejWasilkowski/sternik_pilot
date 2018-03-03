package pl.sternik.aw.pilot.telewizor;

import pl.sternik.aw.pilot.commands.Command;

public class CommandTelewizorGlosnoscMinus implements Command {
    public void execute() {
        Telewizor.instance().glosnoscMinus();
    }

    public String getOpis() {
        return "Zciszono";
    }
}
