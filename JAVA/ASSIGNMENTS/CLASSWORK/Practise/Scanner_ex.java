
import java.util.Scanner;

class Emp{
    String name;
    int empid;
    float sal;

    public void acceptvalue(Scanner sc)
    {
     System.out.println("enter name");
     this.name=sc.nextLine();
     System.out.println("enter empid");
     this.empid=sc.nextInt();
     System.out.println("enter salary");
     float salary = sc.nextFloat();
     this.sal=salary;
    }

    public void printvalue()
    {
     System.out.println(this.name + " " + this.empid + " " + this.sal );
    }
}
public class Scanner_ex{
  public static void main(String[] args) {
    Emp e1 = new Emp();
    Scanner sc = new Scanner(System.in);
    e1.acceptvalue(sc);//(this,sc)
    e1.printvalue();
  }
}