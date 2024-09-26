// function overloading + constructor types + private/public constructor + Singloton class
import java.util.Scanner;

class  Student{
    String name; // nonstatic field
    int prn;     //instance variable
    int marks;   //heap area

    private Student() //PARAMETERLESS CONSTRUCTOR 
    {
     this.name = "shubhangi";
     this.prn = 1022;
     this.marks = 200;
    }
    
    static void value()
    {
        Student s5 = new Student();
        System.out.println("name : " + s5.name + " prn : " + s5.prn + " marks : " + s5.marks);     

    }

    public Student(String name){ //Single parameter constructor
        this.name=name;
    }

    public Student(String name , int prn , int marks) //parameterized constructor
    {
     this.name = name;
     this.prn = prn;
     this.marks = marks;
    }

    public void  printDetail(){
        System.out.println("name : " + name + " prn : " + prn + " marks : " + marks);     
    }
}
public class Constr{
    public static void main(String[] args) {
        
        Student.value();
        //Student s1 = new Student();
       // s1.printDetail();

        Student s2 = new Student("shalini",1002,56);
        s2.printDetail();

        Student s3 = new Student("prath");
        s3.printDetail();

       /*  Student s4 = null; //nullpointer exception
        s4 = new Student();
        s4.printDetail();*/
    }
}
