package fr.oroger;

public class Roule implements Etat {
    @Override
    public void demanderArret() {
        System.out.println("Demande d'arret");
    }

    @Override
    public void demarrer() {
        System.out.println("Déjà entrain de rouler");
    }

    @Override
    public void arreter() {
        System.out.println("Arret à la station en cours");
    }
}
