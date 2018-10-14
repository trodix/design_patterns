package fr.oroger.Factories;

import fr.oroger.Scooters.Scooter;
import fr.oroger.Voitures.Voiture;

public interface FabriqueVehicule {
    public Voiture FabriquerVoiture();
    public Scooter FabriquerScooter();
}
