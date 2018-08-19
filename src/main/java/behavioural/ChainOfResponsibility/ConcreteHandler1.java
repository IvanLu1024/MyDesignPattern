package behavioural.chainOfResponsibility;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {

        if (request.getType()==RequestType.type1){
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;

        }if (successor!=null){
            successor.handleRequest(request);
        }

    }
}
