
import java.util.Stack;

public class BoxUnbox {
    public static void main(String args[]){
        
        Stack stk=new Stack();
        stk.push("one");
        //stk.push(new Integer(2));
        //stk.push(new Double(3.5));
        stk.push(2);//auto-boxing
        stk.push(3.5);//auto-boxing
        System.out.println(stk);
        
        Double d1=(Double)stk.pop();
        //double d2=d1.doubleValue();
        //System.out.println(d2*2);
        System.out.println(d1*2);//auto-unboxing
        System.out.println(d1.doubleValue()*2);
        
        
        
        
    }
            
}
