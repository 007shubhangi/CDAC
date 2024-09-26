public class Localclass {
    public static void main(String[] args) {
        class Base{
            int num1=10;
            int num2=20;

            public Base(){}
            public void print(){
            System.out.println("num1  "+num1);
            }
        }
        Base b1=new Base();
        b1.print();
    }
    //Base b1; Base cannot be resolved to a type
}
