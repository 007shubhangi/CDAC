//try block with finally
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number");

            int num=sc.nextInt();
            System.out.println(num);
        }finally{

        }
    }
}
