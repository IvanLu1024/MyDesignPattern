package behavioural.mediator;

public class CoffeePot extends Colleague {


    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("CoffeePot");

    }

    public void doCoffeePot(){
        System.out.println("doCoffeePot()");

    }
}
