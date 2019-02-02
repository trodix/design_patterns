package fr.oroger;

class Animal {
    private String name;
    private String color;
    private float weight;

    public Animal(String name, String color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void run()
    {
        System.out.println(this.name+"is Running");
    }
}

class Cat extends Animal{
    public Cat(String name, String color, float weight) {
        super(name, color, weight);
    }
}
