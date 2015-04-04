package stack;

/**
 * Created by Michas on 03/04/15.
 */
public interface MyStack {
    void push(long value);
    long pop();
    long peek();
    boolean isFull();
    boolean isEmpty();
}
