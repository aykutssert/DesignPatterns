package CommandPattern;

import CommandPattern.ConcreteCommands.AdjustVolumeCommand;
import CommandPattern.ConcreteCommands.ChangeChannelCommand;
import CommandPattern.ConcreteCommands.TurnOffCommand;
import CommandPattern.ConcreteCommands.TurnOnCommand;
import CommandPattern.GenericCommand.Command;
import CommandPattern.Invoker_RemoteControl.RemoteControl;
import CommandPattern.Receivers.Stereo;
import CommandPattern.Receivers.Tv;
public class CommandPatternExample {
    public static void main(String[] args) {
        // Create devices
        Tv tv = new Tv();
        Stereo stereo = new Stereo();
 
        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);
 
        // Create remote control
        RemoteControl remote = new RemoteControl();
 
        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on
 
        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted
 
        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed
 
        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}
