package fr.oroger;

public abstract class Colleague {
    protected Mediator mMediator;

    public Colleague(Mediator med)
    {
        mMediator = med;
    }

    public abstract void hide();
    public abstract void show();
}
