import java.util.Arrays;
import java.util.Scanner;

class Complex{
    int real;
    int img;

    public Complex(){
        this.real=0;
        this.img=15;
    }
    public Complex(int real,int img){
        this.real=real;
        this.img=img;
    }
    public void accept(Complex[] arr){
        for(int index=0;index<arr.length;index++){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter elements");
            arr[index]=sc.nextInt();
        }
    }
    public void print(Complex[] arr){
        for(Complex ele:arr){
            System.out.println(ele);
        }
    }
}
public class ArrayInstance1 {
    public static void main(String[] args) {
        Complex[] arr=new Complex[5];
        for(int index=0;index<arr.length;index++){
            arr[index]=new Complex();
        }
        System.out.print (Arrays.toString(arr)+" ");
    }
}
