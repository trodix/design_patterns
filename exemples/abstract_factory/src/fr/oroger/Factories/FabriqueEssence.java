package fr.oroger.Factories;

import fr.oroger.Scooters.Scooter;
import fr.oroger.Scooters.ScooterEssence;
import fr.oroger.Voitures.Voiture;
import fr.oroger.Voitures.VoitureEssence;

public class FabriqueEssence implements FabriqueVehicule {
    @Override
    public Voiture FabriquerVoiture() {
        return new VoitureEssence("Renault", "Clio" , 300);
    }

    @Override
    public Scooter FabriquerScooter() {
        return new ScooterEssence("MBK", "Booster", false);
    }
}
