class Person{
    public  String name;
    public String address;

    public Person(){
        name="shubhangi";
        address="pune";
    }
    public  Person(String name,String address){
         this.name=name;
         this.address=address;
    }
    public void showRecord(){
        System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.address);
    }

    public static void f1(){
        System.out.println("inside static method f1");
        //static int s1=10; Illegal modifier for parameter s1; only final is permitted
    }
}
class Emp extends Person{
    public int empid;
    public String name;
    float salary;
    static int empCount=200;

    public Emp(){
        empid=1001;
        name="prath";
        salary=1000.2f;
    }
    public Emp(int empid,String name,float salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;   
    }

    public void printrecord(){
        System.out.println("inside showrecord method");
        System.out.println(" name : " + name + " and " + " salary " + salary );
    }

    public static void empUtility(){
        System.out.println("inside emputility");
    }
}
public class Program3 {
     public static void main(String[] args) {
        Person.f1();// OK 
        Emp.f1();

        Emp.empUtility();
        //Person.empUtility();// NOT OK The method empUtility() is undefined for the type Person
     }
}
