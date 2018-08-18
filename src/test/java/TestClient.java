import behavioural.ChainOfResponsibility.*;
import org.junit.Test;

public class TestClient {
    @Test
    public void test1(){
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);
        Request request1 = new Request(RequestType.type1, "reque st1");
                handler2.handleRequest(request1);
        Request request2 = new Request(RequestType.type2, "reque st2");
                handler2.handleRequest(request2);


    }
}
