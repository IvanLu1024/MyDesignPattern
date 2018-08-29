package structural.decorator;

/**
 * Created by Ivan Lu on 2018/8/29.
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage=beverage;
    }

    public double cost() {
        return 1+beverage.cost();
    }
}
