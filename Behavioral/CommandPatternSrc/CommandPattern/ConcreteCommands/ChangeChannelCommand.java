package CommandPattern.ConcreteCommands;
import CommandPattern.GenericCommand.Command;
import CommandPattern.Receivers.Tv;
// Concrete command for changing the channel of a TV
public class ChangeChannelCommand implements Command {
    private Tv tv;
 
    public ChangeChannelCommand(Tv tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.changeChannel();
    }
}