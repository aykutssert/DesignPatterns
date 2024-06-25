import java.util.ArrayList;

public class PlayList  {
    private ArrayList<MP3> playList;
    public PlayList() {

        playList = new ArrayList<MP3>();
    }
    public void add(MP3 mp3) {
        playList.add(mp3);
    }
    public void play() {
        for (MP3 mp3 : playList) {
            mp3.play();
        }
    }
}
