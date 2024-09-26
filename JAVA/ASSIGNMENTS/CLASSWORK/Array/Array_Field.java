
////single dimention array with array as field of class
import java.util.Scanner;

class Array{
    private int arr[];

    public Array(int size){
        this.arr=new int[size];
    }
    public Array(){
        this.arr=new int[5];
    }
    public void accept(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter element");
            this.arr[i]=sc.nextInt();
        }
    }
    public void print(){
        for(int ele:arr){
            System.out.print(ele);
            System.out.print(" ");
        }
    }
}
public class Array_Field {
    public static void main(String[] args) {
        Array a1=new Array(5);
        a1.accept();
        a1.print();

        Array a2=new Array();
        a2.accept();
        a2.print();
        
    }
}
