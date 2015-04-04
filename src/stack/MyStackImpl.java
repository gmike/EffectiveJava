package stack;

import java.util.EmptyStackException;

/**
 * Created by Michas on 03/04/15.
 */
public class MyStackImpl implements MyStack {
    private final int maxSize;
    private long stack[];
    private int top=-1;

    public MyStackImpl(int size){
        this.maxSize = size;
        stack = new long[maxSize];
    }

    @Override
    public synchronized void push(long value) {
        stack[++top] = value;
    }

    @Override
    public long pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top--];
    }

    @Override
    public long peek() {
        return stack[top];
    }

    @Override
    public boolean isFull() {
        return top==maxSize-1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
