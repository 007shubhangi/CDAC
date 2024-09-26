 class Student{};
public class Annonymous_1 {
    public static void main(String[] args) {
        //Object o1=new Object(){};
        Student obj=new Student(){
            String message="inside annonymous class";
            public String toString(){
                return this.message;
            }
        };
        //String str = obj.toString();
        System.out.println( obj.toString() );
    }
}
