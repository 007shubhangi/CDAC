public class Recursion4 {
    public static int fun(int n){
        if(n<=1)
        { 
            return n;
        }
        else{
        System.out.println("vale of n:"+n);//5
        return n*fun(n-1);// 5*4*3*2 
                      

        }
    }
        public static void main(String[] args) {
            System.out.println(fun(5)); 
       }
    
}
