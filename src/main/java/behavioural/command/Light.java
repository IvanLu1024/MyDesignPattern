package behavioural.command;

/**
 * 相当于接受者（Receiver）
 * 能够实现命令要求实现的相应功能
 *
 */
public class Light {
    public void on(){

        System.out.println("The light is on!");
    }
    public void off(){

        System.out.println("The light is off!");
    }
}
