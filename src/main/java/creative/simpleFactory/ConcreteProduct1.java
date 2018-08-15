package creative.simpleFactory;

/**
 * 具体的实现类1
 */
public class ConcreteProduct1 implements Product {
    public void operation(String s) {
        System.out.println("ConcreteProduct1 operate ---"+s);
    }
}
