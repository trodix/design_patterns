package fr.oroger.Scooters;

public class ScooterElectrique extends Scooter {

    public ScooterElectrique(String marque, String modele, boolean hasTopCase) {
        super(marque, modele, hasTopCase);
    }

    @Override
    public void presentation() {
        System.out.println(
            "ScooterElectrique{" +
            "marque='" + marque + '\'' +
            ", modele='" + modele + '\'' +
            ", hasTopCase=" + hasTopCase +
            '}'
        );
    }
}
