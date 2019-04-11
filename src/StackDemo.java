
import java.util.Stack;

public class StackDemo {
public static void main(String args[]){
    
    String e1="one", e2="two", e3="three", e4="four";
    
    Stack stk=new Stack();
    stk.push(e1);
    stk.push(e2);
    stk.push(e3);
    stk.push(e4);
    
    System.out.println(stk);
    stk.pop();//
    System.out.println(stk);
    stk.pop();//
    System.out.println(stk);
    stk.pop();//
    System.out.println(stk);
}    
}
