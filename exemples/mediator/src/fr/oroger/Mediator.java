package fr.oroger;

public interface Mediator {
    public void registerButton(Colleague btn);
    public void registerProgress(Colleague prg);
    public void registerLabel(Colleague lbl);
    public void search();
    public void cancel();
}
