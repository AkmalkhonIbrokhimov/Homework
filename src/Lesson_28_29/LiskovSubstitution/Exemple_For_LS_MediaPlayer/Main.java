package Lesson_28_29.LiskovSubstitution.Exemple_For_LS_MediaPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AIMP_Player();
        audioPlayer.playAudio();
        MediaPlayer kmpPlayer = new KMP_Player();
        kmpPlayer.playAudio();
        kmpPlayer.playVideo();

    }
}
