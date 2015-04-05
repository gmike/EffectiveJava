package other;

/**
 * Created by Michas on 04/04/15.
 */
public abstract class MInterfaceImpl implements MInterface {

    @Override
    public void doS() {
        System.out.print("abstract");
    }

    @Override
    public void defaultMethod(){
        System.out.print("default in subclass");
    }

}
