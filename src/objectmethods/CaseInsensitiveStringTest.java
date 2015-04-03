package objectmethods;

import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Michas on 03/04/15.
 */

public class CaseInsensitiveStringTest {
    @Test
    public void equalsTest()
    {
        CaseInsensitiveString s1 = new CaseInsensitiveString("tmp");
        CaseInsensitiveString s2 = new CaseInsensitiveString("tmp");
        assertTrue(s1.equals(s2));
        assertTrue(s2.equals(s1));
        assertFalse(s1==s2);
        assertEquals(s1.hashCode(), 3);
    }

    @Test
    public void stringPoolTest(){
        String s1 = "tmp";
        String s2 = "tmp";
        String s3 = new String("tmp");
        assertTrue(s1==s2);
        assertFalse(s1==s3);
    }

    @Test
    public void hashMapTest(){
        HashMap<CaseInsensitiveString, String> map = new HashMap<CaseInsensitiveString, String>();
        map.put(new CaseInsensitiveString("key"),"first");
        map.put(new CaseInsensitiveString("tmp"),"first");


    }
}
