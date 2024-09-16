/*3) Write a program that performs arithmetic operations involving 
different data types (int, double, float) and observes how 
Java handles widening conversions automatically. */
public class Q3 {
    public static void main(String args[]){
        int num1=10;
        double num2=20.00d;
        float num3=40.00f;
        System.out.println("int num1 + double num2 : "+num1+num2);
        System.out.println("int num1 + float num3 : "+num1+num3);
        System.out.println("double num2 + float num3 : "+num2+num3);

    }
}
