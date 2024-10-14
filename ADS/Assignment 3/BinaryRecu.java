package P1;
import java.util.Arrays;
import java.util.*;
public class BinaryRecu {
	
	public static int binaryRecu (int arr[],int left,int right,int key) {
		
		
		if(right < left)
			return -1;
		
		int index;
		int mid = (left+right)/2;
		
		if(key == arr[mid])
			return mid;
		
		if(key<arr[mid])
			index = binaryRecu(arr, left, mid-1, key);
		else
			index = binaryRecu(arr, mid+1, right, key);
		return index;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = {22,77,66,88,99,44,11,33,55};
		Arrays.sort(arr);
		
		System.out.print("Enter number:: ");
		int key = sc.nextInt();
		
		int x = binaryRecu(arr, 0, arr.length-1, key);
		
		if(x != -1)
			System.out.println("Key found at index :: "+x);
		else
			System.out.println("Key not found");
		
		System.out.println(Arrays.toString(arr));
	}
}
