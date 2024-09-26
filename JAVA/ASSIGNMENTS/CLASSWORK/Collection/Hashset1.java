import java.util.*;
class Student{
    private String name;
    private int roll;
    private String addr;

    public Student(){}

    public Student(String name,int roll,String addr){
        this.name=name;
        this.roll=roll;
        this.addr=addr;
    }
    public String toString(){
        return this.name+" "+this.roll+" "+this.addr;
}
public boolean equals( Object obj) {
    if( obj != null ) {
        Student other = (Student) obj;//Downcasting
        if( this.roll == other.roll )
            return true;
    }
    return false;

}
    public int hashCode(){
        return Objects.hash(roll);
    }
}


public class Hashset1{
    public static void main(String[] args) {
        // java.util.Set<String> str=new HashSet<> ();
        // str.add("shubhangi");
        // str.add("Prathmesh");
        // str.add("shubhangi");
        // str.add("shambala");
        // str.add("gauri");
        // str.add("harshu");
        java.util.Set<Student> str=new HashSet<> (); 
        Student s1=new Student("shubhangi",101,"pune");
        Student s8=new Student("prathmesh",10,"mumbai");
        Student s2=new Student("shama",101,"nagar");
        Student s9=new Student("shubhangi",178,"pune");

        str.add(s9);
        str.add(s1);
        str.add(s8);
        str.add(s2);

        //before overriding toString() method of Object class
        System.out.println(str);//[Student@24d46ca6, Student@36baf30c, Student@7a81197d, Student@5ca881b5]
       //after overriding toString() method of Object class
        System.out.println(str);//[shama 10 nagar, shubhangi 178 pune, shubhangi 10 pune, prathmesh 100 mumbai]

        if(s1.equals(s2)){
            System.out.println("equals");
        }
        else
        System.out.println("not equal");
         System.out.println(s1.equals(s2));
         System.out.println(str);//[shubhangi 178 pune, shubhangi 101 pune, prathmesh 10 mumbai]
    }
}
