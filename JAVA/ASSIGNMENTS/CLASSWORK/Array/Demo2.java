public class Demo2 {
    public static void main(String args[]){
        // int arr[]=new int[-5];////NegativeArraySizeException
        // System.out.println(arr[0]);

        //int arr[]=new arr[5]{10,20,50};//array creation with both dimension expression and initialization is illegal

        int arr[]=new int[]{10,20,30};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
       
      
        }
}
