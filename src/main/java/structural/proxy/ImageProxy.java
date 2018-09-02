package structural.proxy;

/**
 * Created by Ivan Lu on 2018/9/2.
 */
public class ImageProxy implements Image {

    private HighResolutionImage image;

    public ImageProxy(HighResolutionImage image) {
        this.image = image;
    }

    public void showImage() {
       while (!image.isLoad()){
           try {
               System.out.println("Temp Image: " + image.getWidth() + " " + image.getHeigh());
               Thread.sleep(1000);
           }catch (InterruptedException e){
               e.printStackTrace();
           }


       }
        image.showImage();
    }
}
