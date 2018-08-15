import creative.singleton.SingletonEnum;
import creative.singleton.SingletonSafeDoubleLock;
import org.junit.Test;

public class TestDemo {

    @Test
    public void testEnum(){
        System.out.println(SingletonEnum.uniqueInstance);

    }
    @Test
    public void testSingleton(){
        SingletonSafeDoubleLock uniqueInstance = SingletonSafeDoubleLock.getUniqueInstance();
        SingletonSafeDoubleLock uniqueInstance1 = SingletonSafeDoubleLock.getUniqueInstance();
        System.out.println(uniqueInstance.equals(uniqueInstance1));
        System.out.println(uniqueInstance1.hashCode());

    }
}
