package creative.factoryMethod;

/**
 *声明工厂方法
 * 相当于创建器
 *
 * 创建器，声明工厂方法，工厂方法通常会返回一个Product类型的实例对象，而且多是抽象方法。
 * 也可以在Creator里面提供工厂方法的默认实现，让工厂方法返回一个缺省的Product类型的实例对象。
 *
 */
public abstract class Factory {
    /**
     * 创建Product的工厂方法
     * @return Product的对象
     */
    abstract public Product factoryMethod();

    public void dosomething(){
        Product product=factoryMethod();
        //do some other things

    }

}
