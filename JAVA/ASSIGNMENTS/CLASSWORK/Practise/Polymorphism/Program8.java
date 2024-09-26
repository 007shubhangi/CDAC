//super()
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
        System.out.println("Name	:	" + this.name);
		System.out.println("Adress	:	" + this.address);
    }
}
class Emp extends Person{
    public int empid;
    float salary;

    public Emp(){
       // super(address);
       //we can call method inside method using show()
        empid=1001;
        salary=1000.2f;
        super.showRecord();
    }
    public Emp(String name, String address,int empid ,float salary){
        //super(name,address);
        this.empid=empid;
        this.salary=salary;   
    }
    public void showRecord(){
        System.out.println("Name	:	" + this.empid);
		System.out.println("Adress	:	" + this.salary);
        System.out.println("Name	:	" + this.name);
		System.out.println("Adress	:	" + this.address);

    }
}
public class Program8{
    public static void main(String[] args) {
        // Person p1=new Person();
        // p1.showRecord();
        // Person p2=new Person("prisha","mh16");
        // p2.showRecord();

        // Emp e1=new Emp("abc","mh45",1002,10005.4f);
        // e1.showRecord(); 
   
        Emp e2 = new Emp();
    }
}

