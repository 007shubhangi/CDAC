
import java.util.Scanner;

public class NestedTryCatch{
public static void main(String[] args) {
    try{
        try(Scanner sc = new Scanner(System.in);){
           System.out.println("enter num1");
           int num1=sc.nextInt();

           System.out.println("enter num2");
           int num2=sc.nextInt();
         
           if (num2==0){
            throw new ArithmeticException("divide by zero");
           }
           else{
            int num3=num1/num2;
            System.out.println(num3);
           }
        }catch(NullPointerException n){
            n.printStackTrace();
        }
    }catch(ArithmeticException A){
        A.printStackTrace();
    }

}
    
}
