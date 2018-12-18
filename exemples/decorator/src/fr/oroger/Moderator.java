package fr.oroger;

public class Moderator implements ModeratorInterface {
    private String[] mCensure;

    public Moderator(String[] censure) {
        mCensure = censure;
    }

    @Override
    public String moderate(String text) {
        for(String search : mCensure) {
            text = text.replaceAll(search,"****");
        }
        return text;
    }
}
