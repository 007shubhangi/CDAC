//Setter() and getter()
import java.util.Scanner;

class Emp{
    private String name;
    private int sal;
    private int empid; 

    Emp() //constructor chaining
    {
        this("sh",2004,455);
    }
    Emp(String a,int b, int c)
    {
        this.name=a;
        this.sal=b;
        this.empid=c;
    }
    public void setSalary(int sal){
        this.sal=sal;
    }
    public int getSal()
    {
     return this.sal;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getname()
    {
        return this.name;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
   public int getempid()
    {
        return this.empid;
    }

    
}
public class Set_method{
    public static void main(String[] args) {

       // Emp e2 = new Emp("shubhuu",122,122);

        Emp e1 = new Emp();
        e1.setSalary(1000);
        e1.setName("Shubhu");
        e1.setEmpid(100255);
        //e1.printval();
        
        System.out.println(e1.getSal());
        System.out.println(e1.getname());
        System.out.println(e1.getempid());
 /* *************************************************************** */  
        //if we want to take user value
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        e1.setName( sc.nextLine());

        System.out.println("enter salary");
        e1.setSalary( sc.nextInt());

        System.out.println("enter empid");
        int id = sc.nextInt();
        e1.setEmpid(id);

        System.out.println(e1.getSal());
        System.out.println(e1.getname());
        System.out.println(e1.getempid());



    
    }
}