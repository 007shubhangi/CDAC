//overridding
class Person{
     String name;
    private String addr;

    public Person(){
        this.name="shakuntala";
        this.addr="pune";
    }
    public void printRecord(){
        System.out.println("name             : " + this.name);
        System.out.println("addr             : " + this.addr);
    }
    public void printl(){
        System.out.println("hii");
    }
}
class Emp extends Person{
    private int age;
    private float salary;

    public Emp(){
        this.age=10;
        this.salary=10;
    }

    public void printRecord(){
        //super.printRecord();//resursion
        super.printRecord(); // printrecord() method inside parent execute
        System.out.println("name :" + super.name); // name field inside parent class
        System.out.println("age             : " + this.age);
        System.out.println("salary             : " + this.salary);

    }



}
public class Program9 {
    public static void main(String[] args) {
        Person p1=new Person();
        //p1.printRecord();

        Emp e1=new Emp();
        e1.printRecord();//name             : 10
                         //addr             : 10.0
    }
}
