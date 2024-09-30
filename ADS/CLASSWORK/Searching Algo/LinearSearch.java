import java.util.*;
import javax.sound.midi.Soundbank;

public class LinearSearch{
    public static int display(int []arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]=new int[] {45,88,9,32,74,66,5,21};
        int index=display(arr,30);
        if(index==-1){
            System.out.println("elelemnt not found");
        }
        else
        System.out.println("index is "+ index);

    }
}