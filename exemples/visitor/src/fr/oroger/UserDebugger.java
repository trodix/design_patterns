package fr.oroger;

public class UserDebugger implements Visitor {
    @Override
    public void visit(User u) {
        String name = u.getName();
        System.out.println(name + " a une taille de " + name.length());
    }
}
