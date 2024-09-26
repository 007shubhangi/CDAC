public class Static_Method3 {
    //private static int num;//static field 
    public static int num;
    public void getnum()
    {  // static int num=10;//local method variable cany be static
        num=num+1; //0+1
        System.out.println(num);
    }
   static {  //static initializer block per class ekdach execute hote
      System.out.println("Inside static");
   }
    public static void accept(){
        System.out.println("inise static method");
    }
    public static void main(String[] args) {
        Static_Method3 m1 = new Static_Method3();
        m1.getnum();//1
        m1.getnum();//2
        accept();

        Static_Method3 m2=new Static_Method3();
        m2.getnum();
        
        
    }
}
