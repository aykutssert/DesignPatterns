package CommandPattern.ConcreteCommands;
import CommandPattern.GenericCommand.Command;
import CommandPattern.Receivers.Device;

public class TurnOffCommand implements Command{
    private Device Device;
    
    public TurnOffCommand(Device Device){
        this.Device = Device;
    }
    
    @Override
    public void execute() {
        Device.turnOff();
    }
    
}
