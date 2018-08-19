import behavioural.chainOfResponsibility.*;
import behavioural.command.*;
import org.junit.Test;

public class TestClient {
    /**
     * 责任链模式的测试类
     */
    @Test
    public void testChain(){
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);
        Request request1 = new Request(RequestType.type1, "reque st1");
                handler2.handleRequest(request1);
        Request request2 = new Request(RequestType.type2, "reque st2");
                handler2.handleRequest(request2);


    }

    /**
     * 命令模式的测试类
     * Client--相当于装配者
     */
    @Test
    public void testCommand(){
        Invoker invoker = new Invoker();
        Light light=new Light();
        Command lightOffCommand = new LightOffCommand(light);
        Command lightOnCommand = new LightOnCommand(light);
        invoker.setOffCommands(lightOffCommand,0);
        invoker.setOnCommands(lightOnCommand,0);
        invoker.onButtonPushed(0);
        invoker.offButtonPushed(0);


    }
    @Test
    public void testInterpreter(){



    }
}
