package fr.oroger.Scooters;

public abstract class Scooter {
    protected String marque;
    protected String modele;
    protected boolean hasTopCase;

    public Scooter(String marque, String modele, boolean hasTopCase) {
        this.marque = marque;
        this.modele = modele;
        this.hasTopCase = hasTopCase;
    }

    public abstract void presentation();
}
