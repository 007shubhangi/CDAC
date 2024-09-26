
class Test{
    static{
        System.out.println("before num1");
    }
    private int num1;
    private int num2;
    private static int num3=500;//instance field initializer
    //class level
    //initializer block or feild initializer madhe initialization kara
     //static block acess only static field
        //num3=10000;
    {
      System.out.println("inside b1");
    }
    //instance initializer bloack
    {
        this.num3=400;
    }
    public Test(){
        this.num1=10;
        this.num2=50;
    }
    static{
     System.out.println("inside b2");
    }
    public Test(int num1 , int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void printRecord()
    {
        System.out.println(this.num1 + " " + this.num2+ " "+ Test.num3);
    }
}
public class Static_Field_Init_block {
    public static void main(String[] args) {
        Test t1= new Test();
        t1.printRecord();
        Test t2=new Test();
        t2.printRecord();
        Test t3 = new Test(1000,2000);
        t3.printRecord();
    }
}
