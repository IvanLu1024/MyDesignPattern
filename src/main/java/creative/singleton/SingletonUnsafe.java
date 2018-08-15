package creative.singleton;

/**
 * 懒汉式-线程不安全
 *
 *
 * 私有静态变量 uniqueInstance 被延迟化实例化，这样做的好处是，
 * 如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源
 *
 * 然而在多线程情况下，可能有多个线程进入if (uniqueInstance==null)
 * 只要，uniqueInstance为空的话，会创建多个实例
 *
 */

public class SingletonUnsafe {
    private static SingletonUnsafe uniqueInstance;

    private SingletonUnsafe(){}

    public static SingletonUnsafe getUniqueInstance(){
        if (uniqueInstance==null){
            uniqueInstance=new SingletonUnsafe();
        }
        return uniqueInstance;

    }

}
