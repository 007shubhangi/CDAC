
class Base{
    private int num=10;
    private void accept(){
        System.out.println("inside base class");
    }
     public void print(){
        System.out.println("inside print");
     }
    }
    class Derive extends Base{
        public void print(){
            System.out.println("inside derive print");
         }
    }
    public class Up_Casting{
        public static void main(String[] args) {
            Base b=new Derive();//upcasting
            b.print();
            // b.accept(); private member accessible only in same class
            // b.num;
            Derive d=(Derive)b;
            d.print();
            d.print();

            // Derive dd=(Derive)new Base();
            // dd.print();//java.lang.ClassCastException
        }
    }