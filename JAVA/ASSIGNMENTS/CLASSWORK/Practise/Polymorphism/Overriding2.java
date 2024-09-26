
class Person{
    protected String name;
    protected String addr;

    public Person(){
    this.name="mahesh";
    this.addr="Mumbai";
    }

    public Person(String name,String addr){
        this.name=name;
        this.addr=addr;
    }

    public void printRecord(){
        System.out.println("name       :    " + this.name);  //mahesh
        System.out.println("addr      :    " + this.addr);  //mumbai
    } 
    public String toString(){
        return "name   :      " + this.name + " " + this.addr;
    }
}
class Emp extends Person{
    int empid;
    float salary;

    public Emp(){
        this.empid=10004;
        this.salary=1000000;
    }
    public Emp(String name,String addr,int empid,float salary){
        super();
        this.empid=empid;
        this.salary=salary;
    }
    public void printRecord(){
        super.printRecord();
        System.out.println("empid       :    " + this.empid);
        System.out.println("salary      :    " + this.salary);  
    }  
    public String toString(){
        super.printRecord();
        return "empid   :      " + this.empid + " " + this.salary;
    }
}

public class Overriding2{
    public static void main (String args[]){
        /*Person p1=null;  //ok
        p1=new Person();  //ok

        Person p2=new Person();//ok
        Person p3=p2;//ok

         Emp e1=null;  //ok
         e1=new Emp();  //ok

         Emp e2=new Emp();//ok
         e1=e2;//ok
         */
     
        Person p1=null;
         p1=new Emp();//ok

         Person p2=new Emp();//ok
  
         Emp e4=new Person();//not ok
         Emp e1=new Emp();
         //e1=p2;//not ok
         e1=new Person();//not ok

        Emp e8=null;
        e1=new Person();//not ok
        
        
     
    }
}