package pl.sternik.aw.pilot.commands;

import pl.sternik.aw.pilot.Fasade.FasadeSprzet;

public class CommandTrybNocny implements Command {
    @Override
    public void execute() {
        FasadeSprzet.trybNocny();
    }

    @Override
    public String getOpis() {
        return "Tryb nocny ";
    }
}
