package CommandPattern.Receivers;

public class Tv implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
    // additional method
    public void changeChannel(){
        System.out.println("Channel is changed");
    }
    
}
