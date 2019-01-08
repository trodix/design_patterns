package fr.oroger;

public class Main {

    public static void main(String[] args) {

        AFP afp = new AFP();
        afp.addNews("TITRE 1");

        NewsObserver lemonde = new LeMonde();
        afp.add(lemonde);

        afp.addNews("TITRE 2");

        NewsObserver huff = new HuffPost();
        afp.add(huff);

        afp.addNews("TITRE 3");

        afp.remove(lemonde);

        afp.addNews("TITRE 4");
    }
}
