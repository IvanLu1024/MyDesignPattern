package structural.facade;

/**
 * 观看电影需要操作很多电器，使用外观模式实现一键看电影功能。
 */
public class SubSystem {

    public void turnOnTv(){
        System.out.println("电视机打开了！");
    }

    public void setCD(String cd){

        System.out.println("放置了"+cd);

    }

    public void starWatching(){
        System.out.println("开始观看了----");
    }

}
