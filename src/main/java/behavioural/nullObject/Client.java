package behavioural.nullObject;

/**
 * Created by Ivan Lu on 2018/8/25.
 */
public class Client {

    public static void main(String[] args) {
        AbstractOperation abstractOperation=func(-1);
        abstractOperation.request();


    }

    public static AbstractOperation func(int para){
        if (para<0){
            return new NullOperation();
        }
        return new  RealOperation();

    }

}
