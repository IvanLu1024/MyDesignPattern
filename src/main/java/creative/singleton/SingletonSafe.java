package creative.singleton;

/**
 * 懒汉式-线程安全
 *
 *
 */

public class SingletonSafe {
    private static SingletonSafe uniqueInstance;

    private SingletonSafe(){}

    // TODO: 2018/8/15 添加上synchronized关键字，则对该方法进行加锁操作，确保一个时间点只有一个线程能够进入该方法
    public static synchronized SingletonSafe getUniqueInstance(){
        if (uniqueInstance==null){
            uniqueInstance=new SingletonSafe();
        }
        return uniqueInstance;

    }

}
