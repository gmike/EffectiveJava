package other;

/**
 * Created by Michas on 28/03/15.
 */
public class CallHierarchy {
}


class SuperClass {
    SuperClass() {
        System.out.println("SuperClass constructor."); //4
    }
    {
        System.out.println("SuperClass initializer block."); //3
    }
    static {
        System.out.println("SuperClass static block."); // 1
    }
}

class SubClass extends SuperClass {
    SubClass() {
        System.out.println("SubClass constructor."); // 6
    }
    {
        System.out.println("SubClass initializer block."); //5
    }
    static {
        System.out.println("SubClass static block."); // 2
    }
}

