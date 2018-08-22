package behavioural.strategy;

/**
 * 策略接口，用来约束一系列具体的策略算法。上下文使用这个接口来调用具体策略
 * 实现定义的算法
 */
public interface QuackBehavior {

    void quck();


}
