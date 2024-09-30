
public class InsertionTech_{
    public static void insertionTech(int []arr){
        int j;
        int temp=arr[arr.length-1];
        for(j=arr[arr.length-2];j>=0 && arr[j]>temp;j-- ){
            arr[j+1]=arr[j];
        }
        arr[j+1]=temp;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,1};
        insertionTech(arr);
    }
}