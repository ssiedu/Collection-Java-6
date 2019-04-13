
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("sunday");
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("monday");
        System.out.println("Total Elements : "+list.size());
        /*
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        */
        //using iterators
        
        Iterator it=list.iterator();

        while(it.hasNext()){
        System.out.println(it.next());
        }
        
        
    }
}
/*
    add, get, size, 
*/
