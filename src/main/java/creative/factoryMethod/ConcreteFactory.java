package creative.factoryMethod;

/**
 * 具体的工厂来实现对象
 * 覆盖实现工厂方法，返回具体的Product实例。
 *
 */
public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

    @Override
    public void dosomething() {
        Product product = factoryMethod();
        product.operation("swing");


    }
}
