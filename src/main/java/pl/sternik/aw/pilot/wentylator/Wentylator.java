package pl.sternik.aw.pilot.wentylator;

public class Wentylator {
    private static Wentylator instance = new Wentylator();

    final WentylatorStan WYLACZONY = new WentylatorWylacz(this);
    final WentylatorStan OBROTY1 = new WentylatorObroty1(this);
    final WentylatorStan OBROTY2 = new WentylatorObroty2(this);
    final WentylatorStan OBROTY3 = new WentylatorObroty3(this);

    private WentylatorStan stan = WYLACZONY;

    private Wentylator() {
        System.out.println("Tworzę sprzęt Wentylator");
    }

    public static Wentylator instance() {
        return instance;
    }

    public void wlacz() {
        System.out.println("Włączam Wentylator");
        stan = stan.wlacz();
    }

    public void wylacz() {
        System.out.println("wyłączam wentylator");
        stan = stan.wylacz();
    }

    public void obroty1() {
        System.out.println("Obroty na 1");
        stan = stan.obroty1();
    }

    public void obroty2() {
        System.out.println("obroty na 2");
        stan = stan.obroty2();
    }

    public void obroty3() {
        System.out.println("obroty na 3");
        stan = stan.obroty3();
    }
}
