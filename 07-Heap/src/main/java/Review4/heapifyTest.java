package Review4;

public class heapifyTest {
    public static void main(String[] args) {
        int[] myarray={2,7,9,11,23,-1};
        MyHeap heap=new MyHeap(myarray);

        heap.printHeap();
        System.out.println(heap.remove());
        heap.insert(-2);
        System.out.println();
        heap.printHeap();



    }

}
