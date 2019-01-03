package fr.oroger;

public class WordDocument extends DocumentGenerator {
    @Override
    void addHeader() {
        System.out.println("TITRE");
    }

    @Override
    void addBody() {
        System.out.println("HELLO WORLD");
    }

    @Override
    void addFooter() {
        System.out.println("Page 1/1");
    }
}
