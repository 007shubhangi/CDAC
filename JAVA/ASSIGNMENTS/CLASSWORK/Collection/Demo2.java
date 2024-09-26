
import java.util.ArrayList;
import java.util.List;

class Student{
    int roll;
    String name;
    int age;
    public Student(int par, String me, int par1){
        this.roll=par;
        this.name=me;
        this.age=par1;
    }
    public Student(){
    
    }
    public String toString(){
        return this.roll+" "+this.name+" "+this.age;
    }
}
public class Demo2{
    public static void main(String[] args) {
        ArrayList<Student> arr=new  ArrayList<>();
    
        Student s1=new Student(1,"meena",10);
        Student s2=new Student(2, "megha",  15);
        Student s3=new Student(3, "manisha",  50);
        Student s4=new Student(4, "teena",  55);
        Student s5=new Student(5, "teena",  5);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        for(Student s: arr){
            System.out.println(s+" ");
        }
        System.out.println(" ");

        arr.remove(s1);
        for(Student s: arr){
            System.out.println(s+" ");
        }
        System.out.println(" ");

        List<Student> arr1=new  ArrayList<>();
        arr1.add(s1);
        arr1.add(s2);
        arr1.add(s3);
        arr1.add(s4);
        arr1.add(s5);

        arr.addAll(arr1);
        System.out.println(arr);

        arr1.removeAll(arr);
        System.out.println(arr);

    }
}