package fr.oroger;

public class LeMonde implements NewsObserver {
    @Override
    public void notify(String titre) {
        System.out.println("LEMONDE = Programmation de "+titre+" pour journal de demain");
    }
}
