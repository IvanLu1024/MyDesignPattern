package structural.flyweight;

/**
 * 具体的享元实现对象，必须是可共享的，需要封装flyweight的内部状态。
 */

public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    public void doOperation(String extrinsicState) {
        System.out.println("Object Address : "+System.identityHashCode(intrinsicState));
        System.out.println("IntrinsicState : "+intrinsicState);
        System.out.println("ExtrinsicState : "+extrinsicState);

    }
}
