package behavioural.visitor;


public interface Visitor {

    void visit(Order order);

    void visit(Customer customer);

    void visit(Item item);
}
