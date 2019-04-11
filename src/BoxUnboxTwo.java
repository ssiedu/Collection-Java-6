
public class BoxUnboxTwo {
    
    public static void show(Object p){
        System.out.println(p);
    }
    
    public static void disp(int p){
        System.out.println(p);
    }
    public static void main(String args[]) {

        show("abc");
        show(10);   //auto-boxing show(new Integer(10));
        show(20.30);//auto-boxing show(new Double(20.30));
        

        Integer ob1=new Integer(25);
        disp(ob1.intValue());//manual unboxing
        disp(ob1);//auto-unboxing
        
        
    }
}
