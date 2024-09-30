
import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binaryRecursion(int arr[],int left,int right,int key){
        int mid,index;
            if(left>right)
                return -1;
            mid=(left+right)/2;
            if(key==arr[mid])
                return mid;
            if(key<arr[mid])
                index=binaryRecursion(arr, left, mid-1, key);
            else
                index=binaryRecursion(arr, mid+1, right, key);
            return index;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key");
        int key=sc.nextInt();
        
        int arr[]=new int[]{11,22,33,44,55,66,77,88,99};
        int index=binaryRecursion(arr, 0, arr.length-1, key);

        if(index==-1)
        System.out.println("key not found");
        else
        System.out.println("key found at index :"+ index);
    }
}
