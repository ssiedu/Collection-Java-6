public class GMultiple<T1,T2> {
    
    public void add(T1 p1, T1 p2){
        
    }
    public void sub(T2 p1, T2 p2){
        
    }
    public void mul(T1 p1, T2 p2){
        
    }
    public void div(T2 p1, T1 p2){
        
    }
    
    public static void main(String args[]){
     
        GMultiple<String,Integer> ob1=new GMultiple<>();
        GMultiple<Integer,String> ob2=new GMultiple<>();
        GMultiple ob3=new GMultiple();
        GMultiple<String,Object> ob4=new GMultiple<>();
    }
}
