public class MP3{
    private String name;

    public MP3(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing MP3: " + name);
    }
}