class Base{
   public void accept(){
    System.out.println("base accept");
   }
   public void show(){
    System.out.println("inside show");
   }
}
class Derive extends Base{
    public void accept(){
        System.out.println("base derive");
       }
       public void display(){
        System.out.println("inside display");
       }
}
public class Upcasting2 {
    public static void main(String[] args) {
        Base b1=new Base();
        b1.accept();

        Derive d=new Derive();
        d.accept();

        Base b2=new Derive();//upcasting
        b2.accept();
        b2.show();
        //b2.print(); not ok

        Derive d2=(Derive)b2;//downcasting Typecasting is mandatory
        d2.accept();
        d2.show();
        d2.display();

        
    }
}
