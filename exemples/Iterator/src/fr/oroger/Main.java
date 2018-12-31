package fr.oroger;

public class Main {

    public static void main(String[] args) {
        Iterable eleveList = new Eleves();
        Iterator iterator = eleveList.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
