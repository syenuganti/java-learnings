package structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        // Do nothing - this player only plays MP4 files
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file: " + filename);
    }
}
