package pl.sternik.aw.pilot.garaz;

public class GarazZamkniety implements GarazStan {
    @Override
    public void zamknij() {
        System.out.println("Nic nie rób");
    }

    @Override
    public void otworz() {
        System.out.println("Otworz garaż");
    }
}
