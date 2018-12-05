package fr.oroger;

public class File implements Data {
    private String mName;

    public File(String n) {
        mName = n;
    }
    @Override
    public void dblClick() {
        System.out.println("Le fichier "+getName()+" est ouvert");
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
