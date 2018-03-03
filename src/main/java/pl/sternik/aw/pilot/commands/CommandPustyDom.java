package pl.sternik.aw.pilot.commands;

import pl.sternik.aw.pilot.Fasade.FasadeSprzet;

public class CommandPustyDom implements Command {
    @Override
    public void execute() {
        FasadeSprzet.pustyDom();
    }

    @Override
    public String getOpis() {
        return "Pusty Dom";
    }
}
