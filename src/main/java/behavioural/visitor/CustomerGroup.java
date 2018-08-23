package behavioural.visitor;


import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {

    private List<Customer> customers=new ArrayList<Customer>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }



}
