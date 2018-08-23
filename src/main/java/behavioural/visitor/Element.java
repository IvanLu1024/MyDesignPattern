package behavioural.visitor;


public interface Element {

    void accept(Visitor visitor);
}
