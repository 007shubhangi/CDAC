class Test{
    private int num1;	//Instance variable
	private int num2;	//Instance variable
	private static int num3;//static field

    public Test()
    {
        num1=10;
        num2=20;
    }
    public void setnum1(int num1){
        this.num1=num1;
    }
    public void setnum2(int num2)
    {
     this.num2=num2;
     //num3=4000; OK static instance access in nonstatic method also
    }
    public static void setnum3(int num3)
    {
     Test.num3=num3;//static field
     //this.num2=300;// NOT OK : nonstatic field/instance
    } 
    public void printrecord()
    {
        System.out.println(this.num1 + " " + this.num2+ " "+ Test.num3);

    }
}
public class Static_Method1 {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.setnum1(100);
        t1.setnum2(2000);
        Test.setnum3(50000000);
        t1.printrecord();

        Test.setnum3(40);//
        t1.printrecord();
    
    }
}
