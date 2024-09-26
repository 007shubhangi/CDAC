//emp is a person

class Person{
    public  String name;
    public String address;
    static int personCount=10;
 
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
}

public class Program2{
    public static void main(String args[]){
       Person p1=new Person();
       Emp e1=new Emp();
       e1.printrecord();
       e1.showRecord();
       p1.showRecord();
       System.out.println("Emp count      :" + Emp.empCount);//OK
      // p1.printrecord(); NOT OK
      System.out.println("Person count      :" + Person.personCount);//ok
      //emp.personCount;
      System.out.println(Emp.empCount);
      System.out.println(Emp.personCount);
      System.out.println(Person.personCount);
      //System.out.println(Person.empCount);  not ok empCount cannot be resolved or is not a field
      

    }
}