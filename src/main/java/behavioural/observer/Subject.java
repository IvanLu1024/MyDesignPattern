package behavioural.observer;

/**
 * 主题接口：
 * 具有注册和移除观察者、并通知所有观察者的功能，主题是通过维
 护一张观察者列表来实现这些操作的
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyAllObservers();
}
