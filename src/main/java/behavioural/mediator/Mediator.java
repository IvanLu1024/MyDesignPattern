package behavioural.mediator;

/**
 * 中介者接口。
 * 在里面定义各个同事之间需要的方法，可以是公共的通讯方法
 */
public abstract class Mediator {
    public abstract void doEvent(String eventType);
}
