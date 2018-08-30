package structural.flyweight;


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
