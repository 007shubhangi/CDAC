//static nested
class Outer{
    int num=10;
    static int number=100;
    static class Inner{
         int num=20;
         private static int number1=45;
        }

         public void print(){
            System.out.println("num: "+num);//10
            System.out.println("num: "+this.number);//100
            Inner in=new Inner();
            System.out.println("num: "+in.num);//20
            System.out.println(Inner.number1);//ol       
    }
}
class Demo4{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.print();
    }
}