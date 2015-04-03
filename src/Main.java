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

        /* Linked List */
        MyLinkedList<String> myList = new MyLinkedList<String>();
        myList.add(new Node<String>("first"));
        myList.add(new Node<String>("second"));
        myList.add(new Node<String>("third"));
        myList.remove(2);
        System.out.print(myList);

        /* Adapter */
        MediaPlayer player = new MediaPlayerAdapter(new AdvancedMediaPlayerImp());
        player.play("mp3");

        /* equals and hashcode */
        CaseInsensitiveString cis1 = new CaseInsensitiveString("Michas");
        CaseInsensitiveString cis2 = new CaseInsensitiveString("Gurgul");
        CaseInsensitiveString cis1copy = new CaseInsensitiveString("Michas");
    }
}
