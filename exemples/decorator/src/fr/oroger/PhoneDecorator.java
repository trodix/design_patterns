package fr.oroger;

public class PhoneDecorator extends Decorator {

    public PhoneDecorator(ModeratorInterface modo) {
        super(modo);
    }

    @Override
    public String moderate(String text) {
        return mDecorated.moderate(text).replaceAll("\\d{10}","------");
    }
}
