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
  public class DownCasting {
    public static void main(String[] args) {
  
         B child=new B();
         A base=child;//upcasting 
  
         A base1=new B();//upcasting
         System.out.println(base1.num1);
         System.out.println(base1.num2);
         //System.out.println(base1.num3); // num3 cannot be resolved or is not a field

        Base b2=new Child();//upcasting
        //Child c2=b2;  //Base cannot be converted to Child    
        Child c2=(Child)b2;//Downcasting explicit typecasting
         System.out.println(c2.num1);
        System.out.println(c2.num2);
        System.out.println(c2.num3);        
        //if we downcast withoun upcast 
        /*Base b2=new Base();
         Child c=(Child)b2;//class Base cannot be cast to class Child
         */

         
  
        
        
  
  
  
  
    }  
  }
  