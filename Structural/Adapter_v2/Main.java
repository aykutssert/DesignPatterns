public class Main {
 
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.add(new MP3("Song1.mp3"));
        playList.add(new WavAdapter("Song2.wav"));
        playList.add(new MP3("Song3.mp3"));
        playList.add(new WavAdapter("Song4.wav"));
        playList.play();
    }
}
