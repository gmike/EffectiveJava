package other;

/**
 * Created by Michas on 04/04/15.
 */
public class MInterfaceImplImpl extends MInterfaceImpl implements MInterface {
    public MInterfaceImplImpl(){
        doS();
    }

    @Override
    public void doS(){
        System.out.print("sub call");
    }
}
