package fr.oroger;

public class SuperCharger {
    private static final int VOLTAGE = 380;


    public void plug(IChargeable car)
    {
        System.out.println("New car plugged");
        car.charge(VOLTAGE);
    }
}
