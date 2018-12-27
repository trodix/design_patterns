package fr.oroger;

public class ImageProxy implements IImage {
    String mPath;

    public ImageProxy(String path) {
        mPath = path;
    }

    @Override
    public void showImage() {
        System.out.println("PROXY ");
        new HighResImage(mPath).showImage();
    }
}
