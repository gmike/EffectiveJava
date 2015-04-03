package designpatterns.adaptor;

/**
 * Created by Michas on 29/03/15.
 */
public class AdvancedMediaPlayerImp implements AdvancedMediaPlayer
{

    @Override
    public void playMp3(String path) {
        System.out.print("playing mp3 from: "+path);
    }

    @Override
    public void playMp4(String path) {
        System.out.print("playing mp4 from: "+ path);
    }
}
