
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]) {
        String e1 = "one", e2 = "two", e3 = "three", e4 = "four";

        LinkedList list = new LinkedList();
        list.add(e1);
        list.add(e2);
        System.out.println(list);
        list.addFirst(e3);
        System.out.println(list);
        list.add(1,e4);
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(2);
        System.out.println(list);
        
        
    }

}
