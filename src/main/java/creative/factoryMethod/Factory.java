package creative.factoryMethod;

/**
 *声明工厂方法
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
