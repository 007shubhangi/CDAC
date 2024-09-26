

class Outer{
    final static int num=10;
    class Inner{
         private int num2=20;
         public void print(){
            int num1=40;
            System.out.println("num: "+num1);//40
            System.out.println("num: "+this.num2);//20
            //System.out.println("num: "+Outer.num);//10 OK
            System.out.println("num: "+num);//10 //OK

         }
    }
}
class Demo3{
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.print();
    }
}
