public class WavAdapter extends MP3{

    private Wav wav;
    public WavAdapter(String name) {
        super(name);
        this.wav = new Wav(name);
    }
    @Override
    public void play() {
        wav.play();
    }
}
