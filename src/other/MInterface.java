package other;

/**
 * Created by Michas on 04/04/15.
 */
public interface MInterface {
    void doS();

    default public void defaultMethod(){
        System.out.print("default method");
    }

    static void staticMethod(){
        System.out.print("static method in the interface");
    }
}
