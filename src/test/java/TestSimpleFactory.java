import creative.simpleFactory.Product;
import creative.simpleFactory.SimpleFactory;
import org.junit.Test;

public class TestSimpleFactory {
    @Test
    public void test1(){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(0);
        product.operation("hello");
    }
}
