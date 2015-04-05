package other;

import org.junit.Test;

import static org.junit.Assert.*;

public class MInterfaceImplImplTest {

    @Test
    public void test(){
        MInterfaceImpl i = new MInterfaceImplImpl();
        i.doS();
        i.defaultMethod();
        MInterface.staticMethod();
    }
}