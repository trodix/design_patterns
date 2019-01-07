package fr.oroger;

public class Arret implements Etat {
    @Override
    public void demanderArret() {
        System.out.println("Veuillez attendre le départ");
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage en cours");
    }

    @Override
    public void arreter() {
        System.out.println("Déjà à l'arret");
    }
}
