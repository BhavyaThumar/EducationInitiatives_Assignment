package Task1.Structural_DesignPattern.AdapterPattern;

// Concrete Adaptee
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }


    public void playVlc(String fileName) {
        // Do nothing
    }
}
