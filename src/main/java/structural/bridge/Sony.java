package structural.bridge;

/**
 * Created by Ivan Lu on 2018/8/26.
 */
public class Sony extends TV {
    @Override
    public void on() {
        System.out.println("Sony on --- ");
    }

    @Override
    public void off() {
        System.out.println("Sony off --- ");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony tune Channel --- ");

    }
}
