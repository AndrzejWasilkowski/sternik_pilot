package pl.sternik.aw.pilot.Fasade;

import pl.sternik.aw.pilot.garaz.Garaz;
import pl.sternik.aw.pilot.swiatlo.Swiatlo;
import pl.sternik.aw.pilot.telewizor.Telewizor;
import pl.sternik.aw.pilot.wentylator.Wentylator;

public class FasadeSprzet {
    public static void wylaczWszystko(){
        Swiatlo.instance().wylacz();
        Telewizor.instance().wylacz();
        Wentylator.instance().wylacz();
    }
    public static void trybNocny(){
        Swiatlo.instance().wylacz();
        Telewizor.instance().wylacz();
        Wentylator.instance().wlacz();
    }
    public static void pustyDom(){
        Swiatlo.instance().wylacz();
        Telewizor.instance().wylacz();
        Wentylator.instance().wylacz();
        Garaz.instance().drzwiGora();
    }
}
