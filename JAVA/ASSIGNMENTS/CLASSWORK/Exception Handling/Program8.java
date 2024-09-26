//Try block with resource
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
           int num;
           System.out.println("enter num");
           num=sc.nextInt();
           System.out.println(num);
        }
    }
}
