//try block with resource and finally
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        try( Scanner sc=new Scanner(System.in);){
            System.out.println("enter num");
            int num=sc.nextInt();
            System.out.println(num);
        }finally{
            System.out.println("inside finally");
        }
    }
}
