import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private float salary;

    Student(){}

    Student(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int compareTo(Student s){
        return this.id-s.id;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.salary;
      }
}
public class Comparable1 {
    public static void display( List<Student> list){
        if(list==null) return;
        for(Student s1:list){
            System.out.println(s1);
        }
    }
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student s1=new Student(10,"shubhangi",500.4f);
        Student s2=new Student(120,"prath",505220.4f);
        Student s3=new Student(1650,"shubhangi",52500.4f);
        Student s4=new Student(1,"shweata",6686500.4f);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list);
        display(list);
        //1 shweata 6686500.5
        //  10 shubhangi 500.4
        //  120 prath 505220.4
        //   1650 shubhangi 52500.4
    }
}
