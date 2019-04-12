
import java.util.Stack;

public class GCollection {
    public static void main(String args[]) {
        Stack<String> stk1=new Stack<String>();
        stk1.push("one"); 
        stk1.push("two");
        String res1=stk1.pop();
        System.out.println(res1);
        
        Stack<Integer> stk2=new Stack<Integer>();
        stk2.push(10); 
        stk2.push(20);
        int res2=stk2.pop();
        System.out.println(res2);
        
        Stack stk3=new Stack();
        stk3.push("xyz");
        stk3.push(10);
        stk3.push(5.6);
        Double res3=(Double)stk3.pop();
        System.out.println(res3);
        
        Stack<Emp> stk4=new Stack<>();
        
        
        
        
            
    }
}
