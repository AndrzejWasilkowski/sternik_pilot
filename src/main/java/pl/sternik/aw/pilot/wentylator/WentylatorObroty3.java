package pl.sternik.aw.pilot.wentylator;

public class WentylatorObroty3 implements WentylatorStan {
    Wentylator wentylator;

    public WentylatorObroty3(Wentylator wentylator) {
        this.wentylator = wentylator;
    }

    @Override
    public WentylatorStan wlacz() {
        System.out.println("Nic nie rób");
        return this;
    }

    @Override
    public WentylatorStan wylacz() {
        System.out.println("Wentylator wyłączono");
        return wentylator.WYLACZONY;
    }

    @Override
    public WentylatorStan obroty1() {
        System.out.println("Nic nie rób");
        return this;
    }

    @Override
    public WentylatorStan obroty2() {
        System.out.println("Ustawiono obroty na 2");
        return wentylator.OBROTY2;
    }

    @Override
    public WentylatorStan obroty3() {
        System.out.println("Nic nie rób");
        return this;
    }
}
