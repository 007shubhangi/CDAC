
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int num1;
        int num2;

         Scanner sc=new Scanner(System.in);
         System.out.println("file open");

         System.out.println("num1:");
         num1=sc.nextInt();
         System.out.println("num2:");
         num2=sc.nextInt();
        try{
         if (num2==0){
               throw new ArithmeticException("Diveide by zero");
         }
         else{
            int num3=num1/num2;
            System.out.println(num3);
         }
        }catch (ArithmeticException | InputMismatchException x){
            System.out.println("inside catch");
            x.printStackTrace();
        }
        finally{
            System.out.println("inside finally");
        }
        System.out.println("file close");


    }
}
