import com.sun.tools.javac.Main;
import java.util.Scanner;

class Emp{
    String name;
    private int empid;
    private int sal;

    public void acceptval(Scanner sc)
    {
    System.out.println("enter name");
     this.name=sc.nextLine();
     System.out.println("enter empid");
     this.empid=sc.nextInt();
     System.out.println("enter salary");
     this.sal=sc.nextInt();
    }

    public  String getName()
    {
        return this.name;
    }

    public void  setName(String Name)
    {
        this.name=Name;
    }

    public void printval()
    {
        System.out.println(this.name);
        System.out.println( this. sal );
        System.out.println(this.empid);
    }
}
public class Scanner_2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Emp E1 = new Emp();//local method instance
    E1.acceptval(sc); //shubhangi 4556 122
    E1.printval();

    String name = E1.getName();//to update name 
    name=name.toUpperCase();// to uppercase name
    E1.setName(name);
    E1.printval();

   }

}
