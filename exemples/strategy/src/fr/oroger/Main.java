package fr.oroger;

public class Main {

    public static void main(String[] args) {
        DetectionStrategy quick = new QuickDetection();
        DetectionStrategy good = new ReliableDetection();

        FaceDetection.criticity criticity = FaceDetection.criticity.LOW;


        FaceDetection faceDetection;

        if(criticity == FaceDetection.criticity.HIGH) {
            faceDetection = new FaceDetection(good);
        } else {
            faceDetection = new FaceDetection(quick);
        }
        faceDetection.process();
    }
}
