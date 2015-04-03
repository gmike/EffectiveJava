package objectmethods;

import org.junit.*;

import java.util.Arrays;
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
        assertFalse(s1 == s2);
        assertEquals(s1.hashCode(), 3);
    }

    @Test
    public void stringPoolTest(){
        String s1 = "tmp";
        String s2 = "tmp";
        String s3 = new String("tmp");
        assertTrue(s1 == s2);
        assertFalse(s1==s3);
    }

    @Test
    public void hashMapTest(){
        HashMap<CaseInsensitiveString, String> map = new HashMap<CaseInsensitiveString, String>();
        map.put(new CaseInsensitiveString("key"),"first");
        map.put(new CaseInsensitiveString("tmp"),"second");
        map.put(new CaseInsensitiveString("tmp"),"third");
        String s = map.get(new CaseInsensitiveString("tmp"));
        assertEquals(map.size(),2);
        assertEquals(s, "third");
    }

    @Test
    public void compareToTest(){
        CaseInsensitiveString[] array = new CaseInsensitiveString[]{new CaseInsensitiveString("michal"), new CaseInsensitiveString("abc"), new CaseInsensitiveString("bcgf")};
        Arrays.sort(array);
        assertEquals(array[2], new CaseInsensitiveString("michal"));
    }
}
