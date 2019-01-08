package fr.oroger;

public class AFP extends Observable {
    public void addNews(String titre) {
        System.out.println("Publication news : "+titre);
        notify(titre);
    }
}
