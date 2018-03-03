package pl.sternik.aw.pilot;

import pl.sternik.aw.pilot.swiatlo.Swiatlo;

public class Pilot {
    public static void main(String[] args) {
        Swiatlo swiatlo = Swiatlo.instance();
        swiatlo.wlacz();
        swiatlo.wylacz();
    }
}
