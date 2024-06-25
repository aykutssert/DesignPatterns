package CommandPattern.Invoker_RemoteControl;

import CommandPattern.GenericCommand.Command;

public class RemoteControl {
    private Command command;
 
    public void setCommand(Command command) {
        this.command = command;
    }
 
    public void pressButton() {
        command.execute();
    }
}
