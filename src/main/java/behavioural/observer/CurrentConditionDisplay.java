package behavioural.observer;

public class CurrentConditionDisplay implements Observer{

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay.update: " + temp +
                " " + humidity + " " + pressure);

    }
}
