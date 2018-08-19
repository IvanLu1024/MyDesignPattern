package behavioural.mediator;

/**
 * 同事类的定义，
 * 通常实现成抽象类，主要负责约束同事对象的类型，并实现一些具体同事类之间的公共功能。
 *
 */
public abstract class Colleague {

    public abstract void onEvent(Mediator mediator);

}
