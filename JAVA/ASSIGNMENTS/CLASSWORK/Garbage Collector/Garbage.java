class Student{
    String name;

    Student(){}

    Student(String name){
        this.name=name;
        System.out.println("Object is created : "+this.name);
    }

    protected void finalize(){
        System.out.println("Garbage collector is called for + : "+this.name);
    }

    public void localObject(){
        Student s=new Student("Inside local method variable");
    }
}
public class Garbage{
    public static void main(String args[]){

        Student s1=new Student("first");
        Student s2=new Student("second");
        s1=s2;//reassigning reference variable
        /*
         * Object is created : first
          Object is created : second
           Garbage collector is called for + : first
         */

         Student s3=new Student("third");
         s3=null;//nullyfying reference variable

         Student s4=new Student("fourth");
         s4.localObject();//local object reference

        System.gc();
    }
}