//final method local variable
import java.util.Scanner;

public class Final_Local_var {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter num1");
        final int num1=sc.nextInt();//10
        //num1+=100;// 110 not okk
        System.out.println(num1);
    }
}
