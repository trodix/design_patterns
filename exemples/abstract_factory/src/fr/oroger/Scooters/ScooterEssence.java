package fr.oroger.Scooters;

public class ScooterEssence extends Scooter {

    public ScooterEssence(String marque, String modele, boolean hasTopCase) {
        super(marque, modele, hasTopCase);
    }

    @Override
    public void presentation() {
        System.out.println(
            "ScooterEssence{" +
            "marque='" + marque + '\'' +
            ", modele='" + modele + '\'' +
            ", hasTopCase=" + hasTopCase +
            '}'
        );
    }
}
