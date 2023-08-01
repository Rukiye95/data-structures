import java.util.NoSuchElementException;

public class MyStack <T> {
    private Node<T> bottom;
    private Node<T> top;
    private int size;

    public void push (T item) {
        Node<T> node=new Node(item);
        if (isEmpty()) bottom=top=node;
        else {
            top.setNext(node);
            top=node;
        }
        size++;
    }

    public boolean isEmpty() { return bottom==null; }

    public T peek() {return (T) top.getValue();}

    public T pop() {
        Node peekNode;
        if(isEmpty()) throw new NoSuchElementException();
        if(top==bottom) {
            peekNode=bottom;
            bottom=top=null;
        }
        else{
            peekNode=top;
            Node<T> previous=getPrevious(top);
            top=previous;
            top.setNext(null);
        }
        size--;
        return (T) peekNode.getValue();
    }

    private Node getPrevious(Node node) {
        Node<T> current=bottom;
        while(current!=null){
            if(current.getNext()==node) return current;
            current=current.getNext();
        }
        return null;
    }

    public int size() {return size;}


}
