//default method : overide krn optional 
import java.util.*;

interface Collection{
    void acceptRecord();
    void printRecord();
    int [] getArray();
    default void sort(){
        int arr[]=this.getArray();
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j +1];
                arr[j+1]=temp;}
                
            }
        }
    }
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
    @Override
    public void sort(){
        //Collection.super.sort();
    }
}
public class DefaultMethod{
    public static void main(String[] args) {
        Collection c1=new Array(5);//upcasting
         c1.acceptRecord();
        // c1.printRecord();
        // c1.getArray();

        //c1.acceptRecord();
        c1.sort();
        c1.printRecord();
    }
}

