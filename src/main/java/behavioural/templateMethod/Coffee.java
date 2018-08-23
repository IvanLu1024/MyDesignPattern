package behavioural.templateMethod;

/**
 * Created by Wei Yu on 2018/8/23.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("add coffee addCondiments");
    }
}
