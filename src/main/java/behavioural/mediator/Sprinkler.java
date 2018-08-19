package behavioural.mediator;

public class Sprinkler extends Colleague {


    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("Sprinkler");

    }

    public void doSprinkler(){
        System.out.println("doSprinkler()");

    }
}
