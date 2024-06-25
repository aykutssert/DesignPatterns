public class Wav {
    
    private String name;

    public Wav(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing Wav: " + name);
    }
}
