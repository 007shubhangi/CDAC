class Base{
    protected int num1;
    protected int num2;
  
    public Base(){
      num1=1000;
      num2=2000;
    }
    public Base(int num1,int num2){
      this.num1=num1;
      this.num2=num2;
    }
    public void printRecord(){
        System.out.println("num1: "+this.num1);
        System.out.println("num2: "+this.num2);
      }
}
class Child extends Base{
    protected int num3;
    protected int num4;
  
    public Child(){
      num3=10;
      num4=20;
    }
    public Child(int num3,int num4){
      this.num3=num3;
      this.num4=num4;
    }
    public void printRecord(){
        System.out.println("num1: "+this.num3);
        System.out.println("num2: "+this.num4);
      }
}
public class DynyamicMethodDispatch {
    public static void main(String[] args) {
        Base base=new Base();
        base.printRecord();//parent printrecord()

        Child child=new Child();
        child.printRecord();//child printrecord()

        System.out.println("*****************************************");
        //when printrecord() found in both classes
        //i.e Dynamic method dispatch
        Base base1=new Child();
        base1.printRecord();//child class printrecord() method cl

        System.out.println("*****************************************");
        //when printrecord() found in base class only    
         /* Base base1=new Child();
         base1.printRecord();
        */
        System.out.println("*****************************************");
        //when printrecord() found in child class only    
        // Base base1=new Child();
        // base1.printRecord();//compile time error

    }
}
