package structural.decorator;

/**
 * Created by Ivan Lu on 2018/8/29.
 */
public class Client {

    public static void main(String[] args) {

        Beverage beverage= new HouseBlend();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());



    }
}
