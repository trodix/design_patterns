package fr.oroger.Factories;

import fr.oroger.Scooters.Scooter;
import fr.oroger.Scooters.ScooterElectrique;
import fr.oroger.Voitures.Voiture;
import fr.oroger.Voitures.VoitureElectrique;

public class FabriqueElectrique implements FabriqueVehicule {
    @Override
    public Voiture FabriquerVoiture() {
        return new VoitureElectrique("Tesla", "Model X",2487);
    }

    @Override
    public Scooter FabriquerScooter() {
        return new ScooterElectrique("Niu", "N-Series", true);
    }
}
