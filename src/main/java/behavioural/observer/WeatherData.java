package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题实现类--天气数据类
 * 天气数据布告板会在天气信息发生改变时更新其内容，
 * 布告板有多个，并且在将来会继续增加
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers=new ArrayList<Observer>();
    }


    public void setMeasurements(float temperature,
                                float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void registerObserver(Observer o) {
        observers.add(o);

    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }

    }

    public void notifyAllObservers() {
        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }

    }
}
