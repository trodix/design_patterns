package fr.oroger;

public class SearchLabel extends Colleague {
    public SearchLabel(Mediator med) {
        super(med);
        med.registerLabel(this);
    }

    public void click()
    {
        mMediator.cancel();
    }

    @Override
    public void hide() {
        System.out.println("Masquage label");
    }

    @Override
    public void show() {
        System.out.println("Affichage label");
    }
}
