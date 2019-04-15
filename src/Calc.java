
import java.util.Stack;

class Data {
    int square;
    int cube;
    
    
}

public class Calc {
    
    public static Data calculate(int number){
        Data ob=new Data();
        ob.square=number*number;
        ob.cube=ob.square*number;
        return ob;
    }
    
    public static void main(String args[]){
        Data data=calculate(5);
        System.out.println(data.square);
        System.out.println(data.cube);
        
    }
}
