package fr.oroger;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Data {

    private String mName;
    private List<Data> mChildren;

    public Folder(String n) {
        mName = n;
        mChildren = new ArrayList<>();
    }

    public void add(Data d) {
        mChildren.add(d);
    }

    public void remove(Data d) {
        mChildren.remove(d);
    }

    @Override
    public void dblClick() {
        System.out.println("Dossier "+this.getName()+" ouvert");
        for(Data data : mChildren) {
            data.dblClick();
        }
    }

    @Override
    public void setName(String n) {
        mName = n;
    }

    @Override
    public String getName() {
        return mName;
    }
}
