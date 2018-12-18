package fr.oroger;

public class EmailDecorator extends Decorator {

    public EmailDecorator(ModeratorInterface modo) {
        super(modo);
    }

    @Override
    public String moderate(String text) {
        return mDecorated.moderate(text).replaceAll("(\\w+)(@.*)","######");
    }
}
