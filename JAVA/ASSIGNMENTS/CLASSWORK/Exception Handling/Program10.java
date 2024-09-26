
import java.util.Scanner;

//resource
class Emp implements AutoCloseable{//Resource type
    int num;
    Scanner sc=new Scanner(System.in);
    public Emp(){
        this.num=100;
    }
    public void acceptNum(int num){
       this.num=num;
    }
    public void printNum(){
        System.out.println("value of num"+num);
    }
    public void close() throws  Exception{
        this.sc.close();
    }
}
public class Program10 {
    public static void main(String[] args) {
        try(Emp e1=new Emp();Scanner sc=new Scanner(System.in);)
        {
          System.out.println("enter num");
          e1.acceptNum(sc.nextInt());
          e1.printNum();
          e1.close();

        }catch (Exception x){
            x.printStackTrace();
        }
    }
}
