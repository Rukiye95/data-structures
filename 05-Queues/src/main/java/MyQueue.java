import java.util.NoSuchElementException;

public class MyQueue <T>{
    private Node<T> front;
    private Node<T> back;
    private int size;

    public void enqueue (T item) {
        Node<T> node=new Node(item);
        if (isEmpty()) front=back=node;
        else {
            back.setNext(node);
            back=node;
        }
        size++;
    }

    public boolean isEmpty() { return front==null; }

    public T peek() {return (T) front.getValue();}

    public T dequeue() {
        Node frontNode;
        if(isEmpty()) throw new NoSuchElementException();
        if(front==back) {
            frontNode=front;
            front=back=null;
        }
        else{
            frontNode=front;
            front=front.getNext();

        }
        size--;
        return (T) frontNode.getValue();
    }

    public int size() {return size;}


}
