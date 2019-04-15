
import java.util.ArrayList;
import java.util.Scanner;

public class StudList {
    public static void main(String args[]){
        
        Stud s1=new Stud(111, "AAA", "CS", 3);
        Stud s2=new Stud(112, "BBB", "IT", 5);
        Stud s3=new Stud(113, "CCC", "EC", 6);
        Stud s4=new Stud(114, "DDD", "MECH", 4);
        Stud s5=new Stud(115, "EEE", "EX", 2);
        
        ArrayList<Stud> studList=new ArrayList<>();
        
        studList.add(s1); studList.add(s2);
        studList.add(s3); studList.add(s4);
        studList.add(s5);
        
        
        System.out.println("Enter Roll No");
        int n=new Scanner(System.in).nextInt();
        
        for(Stud s:studList){
            
            if(s.rno==n){
                s.studInfo();
                break;
            }
        }
        
                
        
        
    }
}
