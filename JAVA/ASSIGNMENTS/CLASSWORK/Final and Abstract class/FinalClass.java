//abstrcat class cha instance bnt nahi
//we can 
abstract class Base{ 
   int a=100;
   int b=200;

   public Base(int a,int b){
    this.a=a;
    this.b=b;
   }
   final public void acceptrecord(){ //100% logically complete
     System.out.println("inside base ");
   }

   public void printRecord(){
   System.out.println("a:"+a);
   System.out.println("b:"+b);
   }
   abstract public void calulate();
}
class Child extends Base{
     int c=30;
     public Child (int a,int b,int c){
        super(a,b);
        this.c=c;
     }
    public void printRecord(){
    System.out.println("c:"+c);
 }
//    public void acceptrecord(){ //we cant override final method
//     System.out.println("inside child ");
//   }
public void calulate(){
    int d=a+b+c;
    System.out.println(d);
}
}
public class FinalClass {
    public static void main(String[] args) {
        // Base b1=new Base();
        // b1.acceptrecord();
        // b1.printRecord();

        Child c1=new Child(100,50,85);
        c1.acceptrecord();
        c1.printRecord();
        c1.calulate();

        
    }
}
