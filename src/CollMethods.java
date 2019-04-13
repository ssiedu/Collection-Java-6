
import java.util.ArrayList;
import java.util.Scanner;

public class CollMethods {
    
    public static void main(String args[]){
        
        ArrayList<String> thDays=new ArrayList<>();
        ArrayList<String> labDays=new ArrayList<>();
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Theory Days");
        for(int i=1;i<=3;i++){
            System.out.println("Enter Day-"+i+" : ");
            String day=sc.next();
            thDays.add(day);
        }
        
        System.out.println("Enter Lab Days");
        for(int i=1;i<=3;i++){
            System.out.println("Enter Day-"+i+" : ");
            String day=sc.next();
            labDays.add(day);
        }
        
        System.out.println("Schedule : ");
        System.out.println("Theory Days : ");
        for(String day:thDays){
            System.out.println(day);
        }
        System.out.println("Lab Days : ");
        for(String day:labDays){
            System.out.println(day);
        }
        
        ArrayList<String> allDays=new ArrayList<>();
        allDays.addAll(thDays);
        allDays.addAll(labDays);
        
        System.out.println(allDays);
        
        //allDays.removeAll(thDays);
        allDays.retainAll(thDays);
        
        System.out.println(allDays);
    }
    
}
