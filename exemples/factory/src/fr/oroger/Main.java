package fr.oroger;

public class Main {

    public static void main(String[] args) {
	    Writer fichier = WriterFactory.getWriter("file");
	    Writer db = WriterFactory.getWriter("db");

	    fichier.write();
	    db.write();

    }
}
