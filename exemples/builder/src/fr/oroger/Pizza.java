package fr.oroger;

enum Taille {PETITE,MOYENNE,GRANDE}
enum Fromage {CHEDDAR,MOZZA,CHEVRE}

public class Pizza {
    Taille mTaille;
    Fromage mFromage;
    boolean mOlive;
    boolean mJambon;

    Pizza(PizzaBuilder builder) {
        mTaille = builder.taille;
        mFromage = builder.fromage;
        mOlive = builder.olive;
        mJambon = builder.jambon;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "mTaille=" + mTaille +
                ", mFromage=" + mFromage +
                ", mOlive=" + mOlive +
                ", mJambon=" + mJambon +
                '}';
    }
}
