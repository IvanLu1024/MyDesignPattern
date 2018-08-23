package behavioural.visitor;

/**
 * Created by Ivan Lu on 2018/8/23.
 */
public class Item implements Element {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
