public class Recursion3 {
    public static int fun(int n){
        if(n==8)
        { 
            return n;
        }
        else{
        System.out.println("vale of n:"+n);//5
        return 2*fun(n+1);

        }

    }
    public static void main(String[] args) {
         System.out.println(fun(5)); 
    }
}
