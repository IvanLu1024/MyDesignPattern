package behavioural.strategy;


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
