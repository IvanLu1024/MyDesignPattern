package structural.bridge;

/**
 * Created by Ivan Lu on 2018/8/26.
 */
public abstract class RomoteControl {
    protected TV tv;

    public RomoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();

}
