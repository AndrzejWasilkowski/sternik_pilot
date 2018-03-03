package pl.sternik.aw.pilot.garaz;

public class GarazOtwarty implements GarazStan {
    @Override
    public void zamknij() {
        System.out.println("Garaż otwarty");
    }

    @Override
    public void otworz() {
        System.out.println("Nic nie rób");
    }
}
