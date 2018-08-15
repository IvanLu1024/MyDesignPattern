package creative.singleton;

/**
 * 静态内部类
 *
 *
 * 当 SingletonStaticInnerClass 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getSingleton() 方法从而触发  SingletonHolder.INSTANCE  时
 * SingletonHolder 才会被加载，此时初始化 INSTANCE 实例。
 * 这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持。
 *
 */

public class SingletonStaticInnerClass {



    
    private SingletonStaticInnerClass(){}

   private static class SingleHoler{
        private static final SingletonStaticInnerClass INSTANCE=new SingletonStaticInnerClass();

    }

    public static SingletonStaticInnerClass getSingleton(){
        return SingleHoler.INSTANCE;
    }

}
