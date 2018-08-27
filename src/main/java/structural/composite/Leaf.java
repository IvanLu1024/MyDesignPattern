package structural.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        throw new UnsupportedOperationException();

    }

    @Override
    void remove(Component component) {
        throw new UnsupportedOperationException();

    }

    @Override
    void print(int level) {
        for(int i=0;i<level;i++){
            System.out.print("--");
        }
        System.out.println("Leaf"+name);

    }
}
