package creative.singleton;

/**
 * 饿汉式-线程安全
 *
 *  线程不安全问题主要是由于 uniqueInstance 被实例化了多次，如果 uniqueInstance
 * 采用直接实例化的话，就不会被实例化多次，也就不会产生线程不安全问题。
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的优势。
 *
 */

public class SingletonSafeDoubleLock {
    // TODO: 2018/8/15 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行
    private volatile static SingletonSafeDoubleLock uniqueInstance;

    private SingletonSafeDoubleLock(){}

    public static SingletonSafeDoubleLock getUniqueInstance(){
        if (uniqueInstance==null){
            synchronized (SingletonSafeDoubleLock.class){
                if (uniqueInstance==null){
                    uniqueInstance=new SingletonSafeDoubleLock();

                }
            }
        }
        return uniqueInstance;

    }

}
