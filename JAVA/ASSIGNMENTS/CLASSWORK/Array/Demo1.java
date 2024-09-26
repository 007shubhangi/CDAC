import java.util.Scanner;
public class Demo1{
    
    public static void accept(int arr[]){
        for(int ele=0;ele<arr.length;ele++){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements");
        arr[ele]=sc.nextInt();
        }
    }

    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String args[]){
    int arr[]=new int[5];
    Demo1 d=new Demo1();
    Demo1.accept(arr);
    Demo1.print(arr);
    }
}