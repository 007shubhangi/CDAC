//multidimentional array with array as field
import java.util.Scanner;

class Array{
    private int [][]arr;//field

    public Array(){
        this.arr=new int[2][4];
    }
    public Array(int row,int col){
        this.arr=new int[row][col];
    }
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
         for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print("enter rows and cols" + " ");
                this.arr[row][col]=sc.nextInt();
            }
            System.out.println(" ");
        }
    }
    public void print(){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(this.arr[row][col]+" ");
            }
            System.out.println(" ");
            }
        }
}
public class MultiDimention2 {
    public static void main(String[] args) {
        Array a1=new Array();

        a1.accept();
        a1.print();
    }
}
