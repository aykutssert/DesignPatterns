package CommandPattern.ConcreteCommands;
import CommandPattern.GenericCommand.Command;
import CommandPattern.Receivers.Stereo;
public class AdjustVolumeCommand implements Command{
    private Stereo stereo;
   
    
    public AdjustVolumeCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.adjustVolume();
    }

}
