package structural.bridge;

/**
 * Created by Ivan Lu on 2018/8/26.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteRemoteControl1 concreteRemoteControl1 = new ConcreteRemoteControl1(new Sony());
        concreteRemoteControl1.on();
        concreteRemoteControl1.off();
        concreteRemoteControl1.tuneChannel();

    }
}
