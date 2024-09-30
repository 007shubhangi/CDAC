import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void insertion(int arr[]){
        int j,i;
        for( i=1;i<arr.length ;i++){}
        int temp=arr[i];
        for(j=i-1;j>=0 && arr[j]>temp ;--j){
            arr[j+1]=arr[j];
        }
        arr[j+1]=temp;
    }
    public static void main(String[] args) {
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array elements");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
}
