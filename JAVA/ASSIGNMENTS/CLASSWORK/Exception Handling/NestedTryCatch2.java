
import java.util.Scanner;
import javax.naming.NameAlreadyBoundException;
import javax.security.auth.x500.X500Principal;

public class NestedTryCatch2 {
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        int num1=10;
        int num2=0;
        int num3=num1/num2;
        System.out.println(num3);
    
            try {
        
            } 
            catch (ArithmeticException e) {
            e.printStackTrace();
            }
    }catch(ArithmeticException e){
    e.printStackTrace();
    }
}
}
