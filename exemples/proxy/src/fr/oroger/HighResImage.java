package fr.oroger;

public class HighResImage implements IImage {

    String mPath;

    public HighResImage(String path) {
        mPath = path;
        load(mPath);
    }

    private void load(String path) {
        System.out.println("Loading image : "+path);
    }

    @Override
    public void showImage() {
        System.out.println("Show image : "+mPath);
    }
}
