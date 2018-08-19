package behavioural.iterator;

/**
 * 迭代器接口。定义访问和遍历元素的接口
 * @param <Item>
 */
public interface Iterator<Item> {
    Item next();

    boolean hasNext();


}
