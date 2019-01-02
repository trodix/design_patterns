package fr.oroger;

public class FaceDetection {

    public enum criticity {
        LOW,
        HIGH
    }

    private DetectionStrategy mStrategy;

    public FaceDetection(DetectionStrategy s) {
        mStrategy = s;
    }

    public void process()
    {
        mStrategy.execute();
    }
}
