
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.plaf.InputMapUIResource;

class Program4{
    public static void main(String args[]){
        Scanner sc=null;
        System.out.println("File Open()");
        sc=new Scanner (System.in);

        System.out.println("num1");
        int num1=sc.nextInt();

        System.out.println("num2 ");
        int num2=sc.nextInt();
        try{
        if (num2==0){
            throw new ArithmeticException("denometer should not zero");
        }
        else{
            int num3=num1/num2;
            System.out.println(num3);
        }
        }catch (ArithmeticException x){
        System.out.println("inside catch");
        x.printStackTrace(); 
        }
        catch (InputMismatchException i)
        {
            i.printStackTrace();
        }
    finally{
        System.out.println("insiide finally");
    }
    }
}

