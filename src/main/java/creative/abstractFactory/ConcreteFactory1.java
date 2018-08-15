package creative.abstractFactory;

/**
 * 具体的工厂1，实现抽象工厂定义的方法，具体实现一系列产品对象的创建。
 */
public class ConcreteFactory1 extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
