package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michas on 03/04/15.
 */
public class NodeTest {
    @Test
    public void getDataTest(){
        Node node = new Node("data");
        assertNotNull(node);
        assertNotNull(node.getData());
        assertTrue(node.getData() instanceof String);
        assertEquals(node.getData(),"data");
    }

}
