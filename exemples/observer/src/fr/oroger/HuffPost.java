package fr.oroger;

public class HuffPost implements NewsObserver {
    @Override
    public void notify(String titre) {
        System.out.println("HUFFPOST = Publication article "+titre+" sur site internet");
    }
}
