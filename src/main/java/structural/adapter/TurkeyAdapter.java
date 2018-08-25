package structural.adapter;

/**
 * Created by Ivan Lu on 2018/8/25.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quck() {
        turkey.gobble();
    }
}
