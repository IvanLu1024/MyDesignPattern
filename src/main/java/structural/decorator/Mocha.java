package structural.decorator;

/**
 * Created by Ivan Lu on 2018/8/29.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    public double cost() {
        return 1+beverage.cost();
    }
}
