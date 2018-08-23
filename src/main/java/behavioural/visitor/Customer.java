package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Lu on 2018/8/23.
 */
public class Customer implements Element {

    private String name;
    private List<Order> orders = new ArrayList<Order>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    void addOrder(Order order){
        orders.add(order);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order:orders){
            order.accept(visitor);
        }


    }
}
