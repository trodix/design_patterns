package fr.oroger;

public class UIMediator implements Mediator {
    Colleague mBtn;
    Colleague mProgress;
    Colleague mLabel;
    @Override
    public void registerButton(Colleague btn) {
        mBtn = btn;
    }

    @Override
    public void registerProgress(Colleague prg) {
        mProgress = prg;
    }

    @Override
    public void registerLabel(Colleague lbl) {
        mLabel = lbl;
    }

    public void search()
    {
        mBtn.hide();
        mProgress.show();
        mLabel.show();
    }

    public void cancel()
    {
        mBtn.show();
        mProgress.hide();
        mLabel.hide();
    }
}
