package CommandPattern.ConcreteCommands;
import CommandPattern.GenericCommand.Command;
import CommandPattern.Receivers.Device;

public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
