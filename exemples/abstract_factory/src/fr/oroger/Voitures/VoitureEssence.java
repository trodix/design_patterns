package fr.oroger.Voitures;

public class VoitureEssence extends Voiture {

    public VoitureEssence(String marque, String modele, int volumeCoffre) {
        super(marque, modele, volumeCoffre);
    }

    @Override
    public void presentation() {
        System.out.println(
            "VoitureEssence{" +
            "marque='" + marque + '\'' +
            ", modele='" + modele + '\'' +
            ", volumeCoffre=" + volumeCoffre +
            '}'
        );
    }
}
