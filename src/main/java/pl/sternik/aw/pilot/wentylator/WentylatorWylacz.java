package pl.sternik.aw.pilot.wentylator;

public class WentylatorWylacz implements WentylatorStan {
    Wentylator wentylator;

    public WentylatorWylacz(Wentylator wentylator) {
        this.wentylator = wentylator;
    }

    @Override
    public WentylatorStan wlacz() {
        System.out.println("Włączono i ustawiono obroty na 1");
        return wentylator.OBROTY1;
    }

    @Override
    public WentylatorStan wylacz() {
        System.out.println("Nic nie rób");
        return this;
    }

    @Override
    public WentylatorStan obroty1() {
        System.out.println("Włączono i ustawiono obroty na 1");
        return wentylator.OBROTY1;
    }

    @Override
    public WentylatorStan obroty2() {
        System.out.println("Nic nie rób");
        return this;
    }

    @Override
    public WentylatorStan obroty3() {
        System.out.println("Nic nie rób");
        return this;
    }
}
