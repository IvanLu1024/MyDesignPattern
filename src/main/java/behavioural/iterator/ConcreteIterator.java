package behavioural.iterator;

/**
 * 具体的迭代器的实现对象。实现对聚合对象的遍历，并跟踪遍历时当前的位置
 * @param <Item>
 */
public class ConcreteIterator<Item> implements Iterator {

    private Item[] items;
    private int position;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    public Object next() {
        return items[position++];
    }

    public boolean hasNext() {
        return position<items.length;
    }
}
