
import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort{
    public static void sort3(int []arr){
        boolean sortflag=false;
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
                sortflag=true;
            }
        }
        System.out.println(Arrays.toString(arr));
        if(!sortflag)
        break;
    }
    }
    //improved bubble sort
    public static void sort2(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
                }
            }
            System.out.println(Arrays.toString(arr));

        }
    }

    public static void sort1(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
                }
            }
        }

    }
    public static void main(String args[]){
        int arr[]=new int[]{1,5,8,9,71};
        System.out.println(Arrays.toString(arr));
        sort3(arr);
        System.out.println(Arrays.toString(arr));
    }
}