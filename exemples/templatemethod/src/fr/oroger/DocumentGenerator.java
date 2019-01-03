package fr.oroger;

public abstract class DocumentGenerator {
    abstract void addHeader();
    abstract void addBody();
    abstract void addFooter();
    final void generate()
    {
        addHeader();
        addBody();
        addFooter();
    }
}
