package fr.oroger;

public class RenaultAdapter implements IChargeable {
    Renault mCar;

    public RenaultAdapter(Renault voiture) {
        mCar = voiture;
    }


    @Override
    public void charge(int voltage) {
        if(voltage > 220) {
            voltage = 220;
            System.out.println("Adaptation tension pour Renault");
        }
        mCar.recharger(voltage);
    }
}
