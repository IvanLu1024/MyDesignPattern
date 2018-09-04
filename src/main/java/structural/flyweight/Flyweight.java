package structural.flyweight;

/**
 * 享元接口，通过这个接口flyweight可以接受并作用于外部状态。
 * 通过这个接口传入外部的状态，在享元对象的方法处理中可能会使用这些外部的数据。
 */
public interface Flyweight {

    void doOperation(String extrinsicState);
}
