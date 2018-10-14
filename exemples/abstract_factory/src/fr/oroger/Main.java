package fr.oroger;

import fr.oroger.Factories.FabriqueElectrique;
import fr.oroger.Factories.FabriqueEssence;
import fr.oroger.Factories.FabriqueVehicule;
import fr.oroger.Voitures.Voiture;

public class Main {

    public static void main(String[] args) {
        FabriqueVehicule fabriqueEssence = new FabriqueEssence();
        FabriqueVehicule fabriqueElec = new FabriqueElectrique();

        commanderVehicule(fabriqueEssence);
        commanderVehicule(fabriqueElec);
    }

    public static void commanderVehicule(FabriqueVehicule vehicule)
    {
        vehicule.FabriquerVoiture().presentation();
    }
}
