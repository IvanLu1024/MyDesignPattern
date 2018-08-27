package structural.composite;

/**
 * 组件类
 *
 */
public abstract class Component {
    protected String name;


    public Component(String name) {
        this.name = name;
    }

    public void print(){
        print(0);
    }

    abstract void print(int level);

    abstract void add(Component component);

    abstract void remove(Component component);
}
