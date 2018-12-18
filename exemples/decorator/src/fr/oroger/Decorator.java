package fr.oroger;

public abstract class Decorator implements ModeratorInterface {
    protected ModeratorInterface mDecorated;

    public Decorator(final ModeratorInterface modo) {
        mDecorated = modo;
    }
}
