//final instance : initialize at instance field initializer
//or inside constructor
class Test{
    private final int number;

    public Test()
    {
        this.number=10;
    }
    public void setNumber(int number)
    {
        //this.number=number;
    }
    public void printRecord()
    {
        System.out.println(this.number);
    }
    
}
public class Final_instance {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.printRecord();
        //t1.setNumber(100);

    }
}
