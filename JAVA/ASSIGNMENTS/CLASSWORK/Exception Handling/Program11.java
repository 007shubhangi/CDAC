
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("enter num1");
            int num1=sc.nextInt();
            System.out.println("enter num2");
            int num2=sc.nextInt();

            if (num2==0){
                throw new ArithmeticException("arithmetic exception");
            }
            else{
                int num3=num1/num2;
                System.out.println(num3);
            }
        }catch(ArithmeticException a){
            a.printStackTrace();
        }
    }
}
