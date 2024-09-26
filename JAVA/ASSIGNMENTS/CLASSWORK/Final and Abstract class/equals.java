class Base{
      
}
class Child extends Base{

}
public class equals {
    public static void main(String[] args) {
       int num1=10;
       int  num2=10;
        if (num1==num2)
        System.out.println("equals");
        else
        System.out.println("not equal");

        Base b =new Base();
        Child c=new Child();
        if (b==c)
        System.out.println("equals");
        else
        System.out.println("not equal"); 
        

        Child c4=new Child();
        Base b2=c4;//upcasting
        if (b2.equals(c4))
        System.out.println("equals");//equals
        else
        System.out.println("not equal");
    }
}
