package behavioural.ChainOfResponsibility;

public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {

        if (request.getType()==RequestType.type2){
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
            return;

        }if (successor!=null){
            successor.handleRequest(request);
        }

    }
}
