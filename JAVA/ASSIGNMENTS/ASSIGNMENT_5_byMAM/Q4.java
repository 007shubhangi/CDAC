
import java.util.Scanner;

/*4)Build a class Student which contains details 
about the Student and compile and run its
instance.
 */
class Student{
    String name;
    String addr;
    int rollNo;
    int std;
   
    Scanner sc=new Scanner(System.in);
    public Student(){
    }
    public Student(String name,int rollNo,int std,String addr){
        this.name=name;
        this.rollNo =rollNo;
        this.std=std;
        this.addr=addr;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setStd(int std){
        this.std=std;
    }
    public void setAddr(String addr){
        this.addr=addr;
    }
    public String getName(){
        return this.name;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public int getStd(){
        return this.std;
    }
    public String getAddr(){
        return this.addr;
    }

    public String toString(){
        return "name:  "+this.name+" "+"rollNo   :"+this.rollNo+"std   :"+this.std+
        " "+ "addr   :"+this.addr;
    }

}
public class Q4 {
    public static void main(String[] args) {
        Student s1=new Student();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter name");
        s1.setName(sc.nextLine());

        System.out.println("enter rollno");
        s1.setRollNo(sc.nextInt());

        System.out.println("enter std");
        s1.setStd(sc.nextInt());
        sc.nextLine();

        System.out.println("enter addr");
        s1.setAddr(sc.nextLine());

        System.out.println(s1.toString());
        
    }
}
