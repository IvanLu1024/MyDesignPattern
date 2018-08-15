package creative.simpleFactory;

/**
 * 具体的实现类
 */
public class ConcreteProduct implements Product {
    public void operation(String s) {
        System.out.println("ConcreteProduct operate ---"+s);
    }
}
