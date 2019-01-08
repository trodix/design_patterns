package fr.oroger;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<NewsObserver> mObservers;

    public Observable() {
        mObservers = new ArrayList<>();
    }

    public void add(NewsObserver o) {
        mObservers.add(o);
        System.out.println("==== Abonnement ====");
    }

    public void remove(NewsObserver o) {
        mObservers.remove(o);
        System.out.println("==== Désabonnement ====");
    }

    public void notify(String titre) {
        for(NewsObserver observer : mObservers) {
            observer.notify(titre);
        }
    }
}
