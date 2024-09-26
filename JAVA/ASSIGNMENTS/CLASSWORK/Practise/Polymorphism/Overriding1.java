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

public class Overriding1{
    public static void main (String args[]){
        Person p1=new Person();
        p1.printRecord(); 
        System.out.println("****************************************************");

        Emp e1=new Emp();
        e1.printRecord(); //10004
                          // 1000000.0

        System.out.println("****************************************************");

        //after super.printRecord() 
        e1.printRecord();   
             //  name       :    mahesh
            // addr      :    Mumbai
            // empid       :    10004
            // salary      :    1000000.0    
        System.out.println("****************************************************");
       
       
        Emp e2=new Emp("rani","pune",21,1546f);    
        e2.printRecord();
            //empid       :    21
            //salary      :    1546.0
        //after super() constructor
        System.out.println("****************************************************");
        e2.printRecord();

        System.out.println("****************************************************");
        System.out.println(e2.toString());

        System.out.println("****************************************************");
        //after super() super class tostring cl
        System.out.println(e2.toString());

    }
}