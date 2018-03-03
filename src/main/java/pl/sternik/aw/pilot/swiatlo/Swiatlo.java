package pl.sternik.aw.pilot.swiatlo;

public final class Swiatlo {
    private static Swiatlo instance = new Swiatlo();

    private Swiatlo(){
        System.out.println("Tworzę światło");
    }

    public static Swiatlo instance(){
        return instance;
    }

    public void wlacz() {
        System.out.println("Włączam swiatło");
//        stanAktualny.wlacz();
//        stanAktualny = wlaczone;
    }
    //
    public void wylacz() {
        System.out.println("Wyłączam swiatło");
//        stanAktualny.wylacz();
//        stanAktualny = wylaczone;
    }
}
