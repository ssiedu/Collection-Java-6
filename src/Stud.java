public class Stud {
    int rno;
    String name;
    String branch;
    int sem;

    public void studInfo(){
        System.out.println("Roll Number  : "+rno);
        System.out.println("Student Name : "+name);
        System.out.println("Branch       : "+branch);
        System.out.println("Semester     : "+sem);
        System.out.println("_______________________________");
    }
    
    public Stud(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    
    public String toString(){
        String s="["+rno+","+name+","+branch+","+sem+"]";
        return s;
    }
}
