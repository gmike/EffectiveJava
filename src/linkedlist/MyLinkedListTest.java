package linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    private MyLinkedList<String> myLinkedList;

    @Before
    public void beforeTest(){
        myLinkedList = new MyLinkedList<String>();
        myLinkedList.add(new Node<String>("first"));
        myLinkedList.add(new Node<String>("second"));
        myLinkedList.add(new Node<String>("third"));

    }

    @Test
    public void testAdd(){
        int size = myLinkedList.getSize();
        myLinkedList.add(new Node<String>("asd"));
        assertEquals(myLinkedList.getSize(),size+1);
    }

    @Test
    public void testGet(){
        assertEquals(myLinkedList.get(2), "second");
    }

    @Test
    public void testRemove(){
        int size = myLinkedList.getSize();
        boolean remove = myLinkedList.remove(3);
        assertTrue(remove);
        assertEquals(myLinkedList.getSize(),size-1);
    }

    @Test(expected = false)
    public void testRemoveFail(){
        myLinkedList.remove(100);
    }
}