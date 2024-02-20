package Lesson_28.LiskovSubstitution.Exemple_For_LS_MediaPlayer;

public class MediaPlayer implements AudioPlayer,VideoPlayer{
    @Override
    public void playAudio() {
        System.out.println("Playing audio..");
    }

    @Override
    public void playVideo() {
        System.out.println("Plaing video");
    }
}
