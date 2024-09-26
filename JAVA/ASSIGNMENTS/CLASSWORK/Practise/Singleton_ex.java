class Singleton{
    private int num1;
    private int num2;
    private static Singleton s2=new Singleton() ;//static feild initializer
    public static Singleton gets2()
    {
        if(s2==null){
            s2=new Singleton();
        }
        return s2;
    }
    public Singleton()
    { 
    }
    public void setNum1(int num1){
        this.num1=num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public void printRecord(){
        System.out.println(this.num1 + " " + this.num2);
    }

}
public class Singleton_ex{
    public static void main(String[] args) {
        Singleton s1=Singleton.gets2();
        s1.setNum1(100);
        s1.getNum1();

        s1.setNum2(200);
        s1.getNum2();

        s1.printRecord();

        Singleton s2=Singleton.gets2();
        s1.printRecord();


    }
}
