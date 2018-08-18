package behavioural.command;

/**
 * 遥控器
 */
public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNum=7;

    public Invoker() {
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    public void setOnCommands(Command onCommand,int slotNum) {
        onCommands[slotNum]=onCommand;
    }

    public void setOffCommands(Command offCommand,int slotNum) {
        offCommands[slotNum]=offCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();

    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();

    }
}
