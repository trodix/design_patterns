package fr.oroger;

public class PizzaBuilder {
    Taille taille;
    Fromage fromage;
    boolean olive;
    boolean jambon;

    PizzaBuilder setTaille(Taille t) {
        taille = t;
        return this;
    }

    PizzaBuilder setFromage(Fromage f) {
        fromage = f;
        return this;
    }

    PizzaBuilder setOlive(boolean o) {
        olive = o;
        return this;
    }

    PizzaBuilder setJambon(boolean j) {
        jambon = j;
        return this;
    }

    Pizza build() {
        return new Pizza(this);
    }
}
