package structural.proxy;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ivan Lu on 2018/9/2.
 */
public class ImageViewer {
    public static void main(String[] args) throws MalformedURLException{
        String image="http://image.jpg";
        URL imageUrl=new  URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(imageUrl);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();


    }

}
