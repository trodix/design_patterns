package fr.oroger;

public class Main {

    public static void main(String[] args) {
	    Pizza pizza = new PizzaBuilder()
                        .setTaille(Taille.GRANDE)
                        .setFromage(Fromage.MOZZA)
                        .setJambon(true)
                        .setOlive(false)
                        .build();

	    System.out.println(pizza.toString());
    }
}
