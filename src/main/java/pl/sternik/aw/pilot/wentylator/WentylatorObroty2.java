package pl.sternik.aw.pilot.wentylator;

public class WentylatorObroty2 implements WentylatorStan {
    Wentylator wentylator;

    public WentylatorObroty2(Wentylator wentylator) {
        this.wentylator = wentylator;
    }

    @Override
    public WentylatorStan wlacz() {
        System.out.println("Nic nie rób");
        return this;
    }

    @Override
    public WentylatorStan wylacz() {
        System.out.println("Wiatrak wyłączony");
        return wentylator.WYLACZONY;
    }

    @Override
    public WentylatorStan obroty1() {
        System.out.println("Zmieniono obroty na 1");
        return wentylator.OBROTY1;
    }

    @Override
    public WentylatorStan obroty2() {
        System.out.println("Nic nie rób");
        return this;
    }

    @Override
    public WentylatorStan obroty3() {
        System.out.println("Ustawiono obroty na 3");
        return wentylator.OBROTY3;
    }
}
