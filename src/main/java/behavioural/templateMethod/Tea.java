package behavioural.templateMethod;

/**
 * Created by Wei Yu on 2018/8/23.
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("add tea addCondiments");
    }
}
