package behavioural.iterator;

/**
 * 具体聚合对象。实现创建相应的迭代器对象。
 *
 */
public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate() {
        items=new Integer[10];
        for (int i=1;i<items.length;i++){
            items[i]=i;
        }


    }

    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
