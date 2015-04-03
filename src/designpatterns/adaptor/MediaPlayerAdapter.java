package designpatterns.adaptor;

/**
 * Created by Michas on 29/03/15.
 */
public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String path) {
        if(path.equals("mp3"))
            advancedMediaPlayer.playMp3(path);
        else
            advancedMediaPlayer.playMp4(path);
    }
}
