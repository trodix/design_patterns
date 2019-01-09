package fr.oroger;

public class ProgressBar extends Colleague {
    public ProgressBar(Mediator med) {
        super(med);
        med.registerProgress(this);
    }

    @Override
    public void hide() {
        System.out.println("Masquage progress bar");
    }

    @Override
    public void show() {
        System.out.println("Affichage progress bar");
    }

}
