import designpatterns.adaptor.AdvancedMediaPlayerImp;
import designpatterns.adaptor.MediaPlayer;
import designpatterns.adaptor.MediaPlayerAdapter;
import designpatterns.builder.NutritionFacts;
import linkedlist.MyLinkedList;
import linkedlist.Node;
import objectmethods.CaseInsensitiveString;

public class Main {

    public static void main(String[] args) {

        /* Builder */
            NutritionFacts nf = new NutritionFacts.Builder(12, 2)
                    .calories(30)
                    .fat(20)
                    .sodium(40)
                    .build();
            System.out.println(nf.toString());

        /* Adapter */
        MediaPlayer player = new MediaPlayerAdapter(new AdvancedMediaPlayerImp());
        player.play("mp3");
    }
}
