import java.util.*;
public class BinarySearch{
    private static int show(int[] arr, int key) {
        int left=0;
        int right=arr.length-1;
        int mid;
        
        while(left<=right){
            mid=(left+right)/2;
            if(key==arr[mid]){
               return mid;
            }
            if(key<mid)
            {
             right=mid-1;
            }
            else{
            left=mid+1;
             }
        } 
        return -1;
    }
    public static void main(String args[]){
   
        int []arr=new int[]{11,22,33,44,55,66,77,99};
        //for binary array must be sorted

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key which you want to search");
        int key=sc.nextInt();
        int index=show(arr,key);

        if(index==-1)
            System.out.println("key not found");
        else
            System.out.println("key found at index : "+index);
    }

  
} 