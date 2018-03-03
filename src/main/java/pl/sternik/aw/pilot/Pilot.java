package pl.sternik.aw.pilot;

import pl.sternik.aw.pilot.commands.*;
import pl.sternik.aw.pilot.garaz.CommandGarazDrzwiDol;
import pl.sternik.aw.pilot.garaz.CommandGarazDrzwiGora;
import pl.sternik.aw.pilot.swiatlo.CommandSwiatloWlacz;
import pl.sternik.aw.pilot.swiatlo.CommandSwiatloWylacz;
import pl.sternik.aw.pilot.telewizor.*;
import pl.sternik.aw.pilot.wentylator.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pilot {
    private Map<String, Command> przyciski = new HashMap<>();
    private boolean menu = true;

    public Pilot() {
        przelaczMenu();
    }

    public static void main(String[] args) {

        Pilot pilot = new Pilot();
        boolean czyDalej = true;
        String wybranyNr = null;

        do {
            System.out.println("");

            pilot.wyswietlMenu();
            System.out.print("Wybierz opcję: ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                wybranyNr = br.readLine();
                System.out.println("");
                pilot.kliknijPrzyciskNr(wybranyNr);
                czyDalej = czyWcisnietoZnakWyjscia(wybranyNr);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Błędny wybór, spróbuj ponownie");
            }

        } while (czyDalej);
    }

    public void kliknijPrzyciskNr(String numer) {
        Command command = getCommandForKey(numer.toUpperCase());
        System.out.println("Kliknięto: " + numer);
        command.execute();
    }

    private static boolean czyWcisnietoZnakWyjscia(String znak) {
        return !(znak.toUpperCase().equals("Z"));
    }

    private Command getCommandForKey(String upperCase) {
        return przyciski.get(upperCase);
    }

    private void wyswietlMenu() {
        System.out.println("------>Menu Pilota<------");
        for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
        }
    }

    public void przelaczMenu(){

        if(menu) {
            menu = false;
            przyciski.put("1", new CommandSwiatloWlacz());
            przyciski.put("2", new CommandSwiatloWylacz());
            przyciski.put("3", new CommandGarazDrzwiGora());
            przyciski.put("4", new CommandGarazDrzwiDol());
            przyciski.put("5", new CommandWentylatorWlacz());
            przyciski.put("6", new CommandWentylatorObroty1());
            przyciski.put("7", new CommandWentylatorObroty2());
            przyciski.put("8", new CommandWentylatorObroty3());
            przyciski.put("9", new CommandWentylatorWylacz());
            przyciski.put("0", new CommandPrzelaczMenu(this));
            //przyciski.put("0", new CommandPusty());
            przyciski.put("Z", new CommandZakoncz());
        } else {
            menu = true;
            przyciski.put("1", new CommandTelewizorWlacz());
            przyciski.put("2", new CommandTelewizorWylacz());
            przyciski.put("3", new CommandTelewizorKanalPlus());
            przyciski.put("4", new CommandTelewizorKanalMinus());
            przyciski.put("5", new CommandTelewizorGlosnoscPlus());
            przyciski.put("6", new CommandTelewizorGlosnoscMinus());
            Command[] komendy = {new CommandTelewizorWylacz(), new CommandWentylatorWylacz()};
            przyciski.put("7", new CommandMakro(komendy));
            przyciski.put("8", new CommandPusty());
            przyciski.put("9", new CommandPusty());
            przyciski.put("0", new CommandPrzelaczMenu(this));
            //przyciski.put("0", new CommandPusty());
            przyciski.put("Z", new CommandZakoncz());
        }
    }

}
