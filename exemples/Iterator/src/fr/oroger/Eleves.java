package fr.oroger;

public class Eleves implements Iterable {
    private String[] mEleves = {"Pierre", "Paul", "Jacques"};

    @Override
    public Iterator createIterator() {
        return new ElevesIterator(mEleves);
    }
}
