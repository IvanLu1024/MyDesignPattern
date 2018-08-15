import creative.abstractFactory.AbstractFactory;
import creative.abstractFactory.AbstractProductA;
import creative.abstractFactory.AbstractProductB;
import creative.abstractFactory.ConcreteFactory1;
import org.junit.Test;

public class TestAbstractFactory {
    @Test
    public void test3(){
        AbstractFactory abstractFactory=new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        System.out.println(productA);
        System.out.println(productB);

    }
}
