package pl.sternik.aw.pilot.commands;

import pl.sternik.aw.pilot.Fasade.FasadeSprzet;

public class CommandWylaczWszystko implements Command {
    @Override
    public void execute() {
        FasadeSprzet.wylaczWszystko();
    }

    @Override
    public String getOpis() {
        return "Wyłącz wszystko";
    }
}
