import java.util.Scanner;

public class MultiDimention1 {
    public static void accept(int[][] arr)
    {
        Scanner sc=new Scanner(System.in);
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print("enter rows and cols" + " ");
                arr[row][col]=sc.nextInt();
            }
            System.out.println(" ");
        }
    }
    public static void print(int [][]arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println(" ");
            }
     }

    public static void main(String[] args) {
         int arr[][]=new int[4][4];
         MultiDimention1.accept(arr);
         MultiDimention1.print(arr);
    
    }
}

