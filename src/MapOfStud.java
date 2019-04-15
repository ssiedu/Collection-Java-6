
import java.util.HashMap;
import java.util.Scanner;

public class MapOfStud {

    public static void main(String args[]) {

        Stud s1 = new Stud(111, "AAA", "CS", 3);
        Stud s2 = new Stud(112, "BBB", "IT", 5);
        Stud s3 = new Stud(113, "CCC", "EC", 6);
        Stud s4 = new Stud(114, "DDD", "MECH", 4);
        Stud s5 = new Stud(115, "EEE", "EX", 2);

        HashMap<String, Stud> map = new HashMap<>();
        map.put("111", s1);
        map.put("112", s2);
        map.put("113", s3);
        map.put("114", s4);
        map.put("115", s5);
        
        System.out.println(map);
        
        /*
        System.out.println("Enter Roll Number To Be Searched : ");
        String rno = new Scanner(System.in).next();

        Stud s = map.get(rno);
        s.studInfo();
        */
    }
}
