package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> child;

    public Composite(String name) {
        super(name);
        child=new ArrayList<Component>();
    }

    @Override
    void add(Component component) {
        child.add(component);

    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    void remove(Component component) {
        child.remove(component);

    }

    @Override
    void print(int level) {
        for (int i=0;i<level;i++){
            System.out.print("--");

        }
        System.out.println("Composite"+name);
        for (Component component:child){
            component.print(level+1);
        }


    }


}
