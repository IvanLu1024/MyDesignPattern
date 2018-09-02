package structural.proxy;

import java.net.URL;

/**
 * Created by Ivan Lu on 2018/9/2.
 */
public class HighResolutionImage implements Image {
    private URL imageUrl;

    private long startTime;

    private int heigh;

    private int width;

    public HighResolutionImage(URL imageUrl) {
        this.imageUrl = imageUrl;
        this.startTime=System.currentTimeMillis();
        this.heigh=600;
        this.width=600;

    }

    public int getHeigh() {
        return heigh;
    }

    public int getWidth() {
        return width;
    }

    public boolean isLoad(){
        //模拟图片延迟3s加载
        long endTime=System.currentTimeMillis();
        return endTime-startTime>3000;

    }



    public void showImage() {
        System.out.println("This is HighResolutionImage ----- "+imageUrl);
    }
}
