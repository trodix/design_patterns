package fr.oroger;

public class Bus {
    private Etat mEtat;

    public Bus(Etat mEtat) {
        this.mEtat = mEtat;
    }

    public void setEtat(Etat e) {
        mEtat = e;
    }

    public void arretStation() {
        mEtat.arreter();
    }

    public void departStation() {
        mEtat.demarrer();
    }

    public void demandeStation() {
        mEtat.demanderArret();
    }
}
