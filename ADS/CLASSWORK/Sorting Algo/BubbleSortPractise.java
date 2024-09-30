
import java.util.Arrays;

public class BubbleSortPractise {
    public static void bubble(int arr[]){
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
                flag=true;
            }
        }
        if(!flag)
        break;
    }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{44,85,14,7,3,225,61,2};
        Arrays.sort(arr);
        bubble(arr);
        System.out.println(Arrays.toString(arr));    
    }
    
}
