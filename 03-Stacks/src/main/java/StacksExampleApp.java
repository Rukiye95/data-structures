public class StacksExampleApp {
    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack();
        // var myStack = new MyStack<Integer>();
        myStack.push('c');
        myStack.push('b');
        myStack.push('a');
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("Size of the stack is : " +myStack.size());

    }
}
