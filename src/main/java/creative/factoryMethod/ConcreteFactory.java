package creative.factoryMethod;

/**
 * 具体的工厂来实现对象
 *
 */
public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
