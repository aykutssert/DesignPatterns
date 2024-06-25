package CommandPattern.Receivers;

public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is off");
    }
    public void adjustVolume(){
        System.out.println("Volume is adjusted");
    }
}
