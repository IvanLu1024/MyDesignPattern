package structural.flyweight;

/**
 * 利用共享的方式来支持大量细粒度的对象，这些对象一部分内部状态是相同的。
 *
 */
public class ClientTest {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight abc = flyweightFactory.getFlyweight("ABC");
        Flyweight abc1 = flyweightFactory.getFlyweight("ABD");
        abc.doOperation("x");
        abc1.doOperation("y");


    }
}
