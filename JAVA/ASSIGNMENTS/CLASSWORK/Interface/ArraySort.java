import java.util.Arrays;

public class ArraySort {
    public static int[] getArray(){
        int arr[]=new int[]{10,55,7,88,1};
        return arr;
    }
    private static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]=ArraySort.getArray();
        ArraySort.printArray(arr);
        Arrays.sort(arr);//pivot Quicksot
        ArraySort.printArray(arr);
        
    }
}
