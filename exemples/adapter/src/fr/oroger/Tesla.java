package fr.oroger;

public class Tesla implements IChargeable {
    @Override
    public void charge(int voltage) {
        System.out.println("Tesla is charging at "+String.valueOf(voltage)+" V");
    }
}
