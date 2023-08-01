import java.util.Scanner;
import java.util.Stack;

public class ExprBalanceCheck {
    public static void main(String[] args) {
        System.out.println("Enter expression : ");
        Scanner scanner=new Scanner(System.in);
        String expression=scanner.next();
        System.out.println(balanceCheck(expression));
    }
    public static boolean balanceCheck(String expr){
        Stack<Character> myStack=new Stack<>();
        for(int i=0;i<expr.length();i++){
        Character ch=expr.charAt(i);
        if(ch!='('&& ch!='['&& ch!='{'&& ch!=')'&&ch!=']'&& ch!='}') continue;
        if(ch=='(' || ch=='['|| ch=='{' ) {
            // Push opening symbol to stack
            myStack.push(ch);
            continue;
        }
        // At this point ch is a closing symbol
        // Stack should'nt be empty.
            if(myStack.isEmpty()) return false;
            char match;
            switch (ch){
                case ')':
                    match= myStack.pop();
                    if (match!='(') return false;
                    break;
                case ']':
                    match= myStack.pop();
                    if (match!='[') return false;
                    break;
                case '}':
                    match= myStack.pop();
                    if (match!='{') return false;
                    break;
            }
        }
        return (myStack.isEmpty());
        }
}
