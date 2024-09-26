public class Swap {
    private static void swap(int []arr){
        int t=arr[0];
        arr[0]=arr[1];
        arr[1]=t;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int arr[]=new int[] {a,b};
        Swap.swap(arr);
        a=arr[0];
        b=arr[1];
        System.out.println(a);
        System.out.println(b);


    }
}
