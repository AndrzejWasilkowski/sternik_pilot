package pl.sternik.aw.pilot.telewizor;

public class Telewizor {
    private static Telewizor instance = new Telewizor();

    private Telewizor() {
        System.out.println("Tworzę sprzęt Telewizor");
    };

    public static Telewizor instance() {
        return instance;
    }

    public void wlacz() {
        System.out.println("Włączam TV");
    }

    public void wylacz() {
        System.out.println("Wyłączam TV");
    }

    public void kanalPlus() {
        System.out.println("Następny kanał");
    }

    public void kanalMinus() {
        System.out.println("Poprzedni kanał");
    }

    public void glosnoscPlus() {
        System.out.println("głosniej");
    }

    public void glosnoscMinus() {
        System.out.println("ciszej");
    }
}
