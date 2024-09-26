class A{
  protected int num1;
  protected int num2;

  public A(){
    num1=10;
    num2=20;
  }
  public A(int num1,int num2){
    this.num1=num1;
    this.num2=num2;
  }
  public void setNum1(int num1){
    this.num1=num1;
  }
  public void setNum2(int num2){
    this.num2=num2;
  }
  public void printRecord(){
    System.out.println("num1: "+this.num1);
    System.out.println("num2: "+this.num2);
  }
}
class B extends A{
    protected int num3;
    
    public B(){

    }
    public B(int num1,int num2,int num3){
        super(num1,num2);
        this.num3=num3;
    }
    public void setNum3(int num3){
        this.num3=num3;
    }
    public void printRecord(){
        System.out.println("num1: "+this.num3);
        System.out.println("num1: "+this.num1);
        System.out.println("num1: "+this.num2);

      }
}
public class Upcasting {
  public static void main(String[] args) {
      /*A a1=new A();
      a1.printRecord();//10 20

      a1.setNum1(1000);
      a1.setNum2(2000);
      a1.printRecord();//1000 2000
      */
   
      /* B b1=new B();
       b1.printRecord();// 0
       
       b1.setNum3(4000);
       b1.printRecord();//4000
       b1.setNum1(533);
       b1.printRecord();
       */

      /* member of super class inherit into subclass so we consider sub is instance of super class
       A a1=null;
       a1=new B();//upcasting
       compiler yeto a1 cha type check krto i.e A . right side cha instance cha type pn to A ch conside krto
       A mdhe fkt num1 ani num2 ahe tyamul tewdhch print hot
       
        System.out.println(a1.num1);
       System.out.println(a1.num2);
       System.out.println( a1.num3);//is not a field
       */

       B child=new B();
       A base=child;//upcasting 

       A base1=new B();//upcasting

       System.out.println(base1.num1);
       System.out.println(base1.num2);
       //System.out.println(base1.num3); num3 cannot be resolved or is not a field

      
      




  }  
}
