//static nested
class Outer{
    private int num1=10;
    static int number=100;
    
    static class Inner{
         int num=20;
         private static int number1=45;
         public void print(){
            //inside static class we acess only static menbers directly
            // System.out.println("num: "+num1);//10
            // System.out.println("num: "+this.number);//100
            Outer out=new Outer();
            System.out.println("num: "+out.num1);//10
            System.out.println("num: "+out.number);//100
            System.out.println("num: "+num);//20
            System.out.println(number1);//45
         }       
    }
}
class Demo5{
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.print();
    }
}