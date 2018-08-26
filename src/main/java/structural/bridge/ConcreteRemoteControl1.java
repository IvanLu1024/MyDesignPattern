package structural.bridge;

/**
 * Created by Ivan Lu on 2018/8/26.
 */
public class ConcreteRemoteControl1 extends RomoteControl {

    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1 on ---");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1 off");
        tv.off();

    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl1 tuneChannel ---");
        tv.tuneChannel();
    }
}
