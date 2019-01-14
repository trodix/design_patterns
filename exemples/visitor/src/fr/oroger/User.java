package fr.oroger;

public class User implements Visitable {

    private String mName = "";

    public User(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
