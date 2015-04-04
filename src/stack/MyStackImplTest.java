package stack;

import org.junit.Before;
import org.junit.Test;
import sun.invoke.empty.Empty;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MyStackImplTest {
    private MyStackImpl stack;

    @Before
    public void init(){
        stack = new MyStackImpl(5);
    }

    @Test
    public void testPush() {
        assertTrue(stack.isEmpty());
        stack.push(4l);
        assertTrue(!stack.isEmpty());
        assertEquals(stack.peek(), 4l);
    }

    @Test(expected = EmptyStackException.class)
    public void testPop(){
        stack.pop();
    }

    @Test
    public void testPeek() {
        stack.push(4l);
        stack.peek();
        assertTrue(!stack.isEmpty());
    }

    @Test
    public void testIsFull() {

    }

    @Test
    public void testIsEmpty() {

    }
}