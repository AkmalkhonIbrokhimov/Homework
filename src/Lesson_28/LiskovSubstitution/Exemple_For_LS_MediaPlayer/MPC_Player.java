package Lesson_28.LiskovSubstitution.Exemple_For_LS_MediaPlayer;

public class MPC_Player extends MediaPlayer{
    @Override
    public void playAudio() {
        super.playAudio();
    }

    @Override
    public void playVideo() {
        super.playVideo();
    }
}
