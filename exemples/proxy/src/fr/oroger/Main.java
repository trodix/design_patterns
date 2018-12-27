package fr.oroger;

public class Main {

    public static void main(String[] args) {
	    IImage proxyImage1 = new ImageProxy("bigImg1.jpg");
        IImage proxyImage2 = new ImageProxy("bigImg2.jpg");
        IImage proxyImage3 = new ImageProxy("bigImg3.jpg");

        proxyImage2.showImage();

        System.out.println("------------------");

        IImage image1 = new HighResImage("bigImg1.jpg");
        IImage image2 = new HighResImage("bigImg2.jpg");
        IImage image3 = new HighResImage("bigImg3.jpg");

        image2.showImage();
    }
}
