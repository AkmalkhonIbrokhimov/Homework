package Lesson_28.LiskovSubstitution.Exemple_For_LS_MediaPlayer;

public class AIMP_Player implements AudioPlayer{
    @Override
    public void playAudio() {
        System.out.println("Playinn audio...");
    }
}
