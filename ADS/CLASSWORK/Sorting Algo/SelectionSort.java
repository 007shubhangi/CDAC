import java.util.*;
public class SelectionSort{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++)
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            }
        }
        //System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        int arr[]=new int[]{4,8,96,3,5,7,9};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}