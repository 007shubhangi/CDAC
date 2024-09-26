
import java.util.Scanner;

public class MultiDimentional {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];

        Scanner sc=new Scanner(System.in);
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print("enter "+row+" and "+col+"");
                arr[row][col]=sc.nextInt();
            }
            System.out.println(" ");
        }


        for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            System.out.print(arr[ row ][ col ]+"  ");
        }
        System.out.println(" ");
        }
        }
}
