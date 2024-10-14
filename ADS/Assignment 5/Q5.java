/*5. Reverse Array in Place
Problem: Write a Java program to reverse an array in place.

Test Cases:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Input: arr = [7, 8, 9]
Output: [9, 8, 7]
 */
import java.util.*;
class Array{
    private int arr[];
    Array(){
        arr=new int[5];
    }
    Array(int size){
        arr=new int[size];
    }
    public static void getArray(int arr[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
        System.out.println("enter elements");
        arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            
        }

    }
}
public class Q5{
    
    public static void main(String args[]){
        Array a1=new Array(5);
    }
}