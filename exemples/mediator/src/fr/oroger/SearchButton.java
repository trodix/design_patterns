package fr.oroger;

public class SearchButton extends Colleague {
    public SearchButton(Mediator med) {
        super(med);
        med.registerButton(this);
    }

    public void click()
    {
        mMediator.search();
    }

    @Override
    public void hide() {
        System.out.println("Masquage bouton");
    }

    @Override
    public void show() {
        System.out.println("Affichage bouton");
    }
}
