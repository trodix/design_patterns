package fr.oroger;

public class Main {

    public static void main(String[] args) {

	    String[] interdits = {"foo","bar"};
	    String text = "Texte a censurer. " +
                "Les mots comme foo et bar doivent etre supprimés. " +
                "Voici un numéro : 0102030405 et un email toto@test.com";

	    Moderator modo = new Moderator(interdits);
	    System.out.println(modo.moderate(text));

	    PhoneDecorator phone = new PhoneDecorator(modo);
	    System.out.println(phone.moderate(text));

	    EmailDecorator email = new EmailDecorator(phone);
        System.out.println(email.moderate(text));

    }
}
