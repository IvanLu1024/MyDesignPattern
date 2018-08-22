package behavioural.strategy;
/**
 * 相当于上下文对象，这个对象负责持有算法，但是不负责
 * 决定具体选用哪个算法，把选择算法的功能交给了用户
 * 这样一来，具体的算法和直接使用算法的用户就不是耦合的，是分离的。
 */

public class Duck {

    private QuackBehavior behavior;

    public void performQuack(){
        if (behavior!=null){
            behavior.quck();

        }
    }

    public void setBehavior(QuackBehavior behavior) {
        this.behavior = behavior;


    }
}
