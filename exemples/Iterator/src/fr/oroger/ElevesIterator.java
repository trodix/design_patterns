package fr.oroger;

public class ElevesIterator implements Iterator {

    private String[] mEleves;
    private int mIndex = 0;

    public ElevesIterator(String[] eleves) {
        mEleves = eleves;
    }

    @Override
    public String next() {
        return mEleves[mIndex++];
    }

    @Override
    public boolean hasNext() {
        return mIndex < mEleves.length;
    }
}
