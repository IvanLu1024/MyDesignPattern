import creative.prototype.ConcreteType;
import creative.prototype.Prototype;
import org.junit.Test;

public class TestPrototype {
    @Test
    public void test(){
        Prototype prototype1 = new ConcreteType("abc");
        Prototype prototype2 = prototype1.myClone();
        System.out.println(prototype1.toString());
        System.out.println(prototype1.equals(prototype2));



    }
}
