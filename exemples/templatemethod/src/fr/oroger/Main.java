package fr.oroger;

public class Main {

    public static void main(String[] args) {
	    DocumentGenerator doc = new HTMLDocument();
	    doc.generate();

	    DocumentGenerator doc2 = new WordDocument();
	    doc2.generate();
    }
}
