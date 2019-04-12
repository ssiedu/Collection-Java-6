public class GDemo<T> {
    
    T v1,v2;

    public void add(T p, T q){
        
    }
    
    public static void main(String args[]) {
        
        GDemo<String> ob1=new GDemo<String>();
        ob1.add("ab","cd");
        
        GDemo<Integer> ob2=new GDemo<Integer>();
        ob2.add(10,20);
        
        GDemo ob3=new GDemo();
        ob3.add(5,"xyz");
        
        
        
        
        
        
    }
            
    
}
