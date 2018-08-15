import creative.abstractFactory.AbstractFactory;
import creative.abstractFactory.ConcreteFactory1;
import creative.factoryMethod.ConcreteFactory;
import creative.factoryMethod.Factory;
import creative.simpleFactory.Product;
import creative.simpleFactory.SimpleFactory;
import org.junit.Test;

public class TestSimpleFactory {
    @Test
    public void test1(){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(0);
        product.operation("hello");
    }
    @Test
    public void test2(){
        Factory factory=new ConcreteFactory();
        factory.dosomething();
    }



}
