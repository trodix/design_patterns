package fr.oroger.Voitures;

public abstract class Voiture {
    protected String marque;
    protected String modele;
    protected int volumeCoffre;

    public Voiture(String marque, String modele, int volumeCoffre) {
        this.marque = marque;
        this.modele = modele;
        this.volumeCoffre = volumeCoffre;
    }

    public abstract void presentation();
}
