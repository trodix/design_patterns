package fr.oroger;

public class Main {

    public static void main(String[] args) {
        Etat roulant = new Roule();
        Etat arreter = new Arret();

        Bus bus = new Bus(arreter);

        bus.demandeStation();
        bus.arretStation();
        bus.departStation();

        System.out.println("==========\n CHANGEMENT ETAT \n==========");
        bus.setEtat(roulant);

        bus.demandeStation();
        bus.departStation();
        bus.arretStation();
    }
}
