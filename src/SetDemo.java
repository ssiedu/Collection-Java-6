
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
     public static void main(String args[]){
        
        
        //HashSet<String> set=new HashSet<>();
        
        //LinkedHashSet<String> set=new LinkedHashSet<>();
        
        TreeSet<String> set=new TreeSet<>();
        
        set.add("sunday");
        set.add("monday");
        set.add("tuesday");
        set.add("wednesday");
        set.add("thursday");
        set.add("friday");
        set.add("saturday");
        set.add("monday");
        System.out.println(set);
        System.out.println("Total Elements : "+set.size());
        
        for(String element:set){
            System.out.println(element);
        }
       
        System.out.println(set.contains("monday"));
        
        set.remove("monday");
        System.out.println(set);
        System.out.println(set.contains("monday"));
        
        
    }
}
