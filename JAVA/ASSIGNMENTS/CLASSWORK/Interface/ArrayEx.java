import java.util.*;

interface Collection{
    void acceptRecord();
    void printRecord();
    int [] getArray();
}
class Array implements Collection{
    public int[] arr;
    public Array(){
    }
    public Array(int size){
      this.arr=new int[size];
    }
    public void acceptRecord(){
        try(Scanner sc=new Scanner(System.in)) {
            for (int index=0;index<this.arr.length;index++){
                System.out.print("enter element  :");
                this.arr[index]=sc.nextInt();
            }
       
        }
    }
    public void printRecord(){
        for (int i=0;i<this.arr.length;i++){
            System.out.print(this.arr[i] + " ");
        }
    }
    public int [] getArray(){
        return this.arr;
    }
}
public class ArrayEx{
    public static void main(String[] args) {
        Collection c1=new Array(5);//upcasting
        c1.acceptRecord();
        c1.printRecord();
        c1.getArray();
    }
}
