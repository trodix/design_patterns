package fr.oroger;

interface Language {
    public void talk();
}

public class Human {
    private String name;
    private String color;
    private float weight;

    public Human(String name, String color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void run()
    {
        System.out.println(this.name+"is Running");
    }
}

class Francais extends Human implements Language {

    public Francais(String name, String color, float weight) {
        super(name, color, weight);
    }

    @Override
    public void talk() {
        System.out.println("Je parle français");
    }
}

class Anglais extends Human implements Language {

    public Anglais(String name, String color, float weight) {
        super(name, color, weight);
    }

    @Override
    public void talk() {
        System.out.println("I Speak english");
    }
}

class Muet extends Human
{
    public Muet(String name, String color, float weight) {
        super(name, color, weight);
    }
}