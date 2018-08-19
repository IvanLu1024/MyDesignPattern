package behavioural.iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
