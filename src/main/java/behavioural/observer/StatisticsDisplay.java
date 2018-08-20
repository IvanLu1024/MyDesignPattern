package behavioural.observer;

public class StatisticsDisplay  implements Observer{

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp +
                " " + humidity + " " + pressure);

    }
}
