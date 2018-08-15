package creative.abstractFactory;

/**
 * 抽象工厂
 * 定义创建一系列产品对象的操作接口
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();

}
