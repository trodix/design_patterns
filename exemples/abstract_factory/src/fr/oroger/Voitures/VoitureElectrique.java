package fr.oroger.Voitures;

public class VoitureElectrique extends Voiture {

    public VoitureElectrique(String marque, String modele, int volumeCoffre) {
        super(marque, modele, volumeCoffre);
    }

    @Override
    public void presentation() {
        System.out.println(
                "VoitureElectrique{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", volumeCoffre=" + volumeCoffre +
                '}'
        );
    }
}
