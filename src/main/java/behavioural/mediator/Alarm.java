package behavioural.mediator;

public class Alarm extends Colleague {


    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("Alarm");

    }

    public void doAlarm(){
        System.out.println("doAlarm()");

    }
}
