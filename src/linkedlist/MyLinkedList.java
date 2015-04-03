package linkedlist;

/**
 * Created by Michas on 28/03/15.
 */
public class MyLinkedList<T> {
    private Node<T> head;
    private int listCount;

    public MyLinkedList(){
        head = new Node<T>(null);
        listCount = 0;
    }

    public void add(Node<T> node){
        Node<T> currentNode = head;
        synchronized (this) {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
            listCount++;
        }
    }

    public T get(int index){
        if(index <= 0)
            return null;
        Node<T> currentNode = head.getNext();
        for(int i=1; i<index && currentNode.getNext() != null; i++)
            currentNode = currentNode.getNext();
        return currentNode.getData();
    }

    public boolean remove(int index)
    {
        if(index <= 0 || index > listCount)
            return false;
        Node<T> currentNode = head.getNext();
        Node<T> tempNode = currentNode;
        for(int i=1; i<index && currentNode.getNext()!=null; i++){
            tempNode = currentNode;
            currentNode = currentNode.getNext();
        }
        tempNode.setNext(currentNode.getNext());
        listCount--;
        return true;
    }

    public int getSize(){
        return listCount;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node<T> currentNode = head.getNext();
        for(int i=0; i<listCount; i++) {
            result.append(currentNode.getData().toString() + "\n");
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }

}
