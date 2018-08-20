package behavioural.memento;

/**
 * 负责保存备忘录的对象
 */
public class Caretaker {

    /**
     * 记录被保存的备忘录对象
     */
    private Memento memento=null;

    /**
     * 保存备忘录对象
     * @param memento
     */
    public void saveMemento(Memento memento){
        this.memento=memento;

    }

    /**
     * 获取被保存的备忘录对象
     * @return
     */
    public Memento retriveMemeto(){
        return memento;
    }
}
