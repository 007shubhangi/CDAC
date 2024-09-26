//REsource and Autoclosable
import java.util.Scanner;
class Test implements AutoCloseable{
       Scanner sc=new Scanner(System.in);
       int num1;
     public Test(){

     }
     public void acceptRecord(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter num1");
       num1=sc.nextInt();
     }
     public void printRecord(){
        System.out.println("num1:"+ num1);
     }
     //@Override
    public void close() throws  Exception{
        this.sc.close();
    }
}
public class Program5{
    public static void main(String[] args) {
      try {
          Test t=new Test();//Rsource
          t.acceptRecord();
          t.printRecord();
          t.close();
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
}