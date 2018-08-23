package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Lu on 2018/8/23.
 */
public class Order implements Element {

    private String name;
    private List<Item> items = new ArrayList();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.items.add(new Item(itemName));
    }

    public String getName() {
        return name;
    }

    void addItem(Item item){
        items.add(item);
    }

    public void accept(Visitor visitor) {

        visitor.visit(this);

        for (Item item:items){
            item.accept(visitor);
        }

    }
}
