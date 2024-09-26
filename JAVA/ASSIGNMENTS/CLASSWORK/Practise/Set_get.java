
import java.util.Scanner;

class Student{
    String name;
    int studentid;

    public void setname(String name){
        this.name=name;
    }
    public void setstudentid(int studentid)
    {
        this.studentid=studentid;
    }
    public String getname()
    {
     return  this.name;
    }
    public int getid()
    {
     return  this.studentid;
    }
}
public class Set_get {
    public static void main(String[] args) {
        Student S1 = new Student(); //local method instance 

        S1.setname("Shubhangi");
        S1.setstudentid(12205);
        System.out.println(S1.getname());
        System.out.println(S1.getid());

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        S1.setname(sc.nextLine());
        System.out.println("enter id");
        S1.setstudentid(sc.nextInt());
       
        System.out.println(S1.getname());
        System.out.println(S1.getid());

    }
}
