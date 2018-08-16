package creative.prototype;

public class ConcreteType extends Prototype {
    private String field;
    public ConcreteType(String field){
        this.field=field;

    }

    @Override
    public Prototype myClone() {
        return new ConcreteType(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
