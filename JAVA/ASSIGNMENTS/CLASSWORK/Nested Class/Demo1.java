class Outer{
    int num=10;
    class Inner{
         int num=20;
         public void print(){
            int num=40;
            System.out.println("num: "+num);//40
            System.out.println("num: "+this.num);//40
            System.out.println("num: "+Outer.this.num);//40
 
         }
    }
}
class Demo1{
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.print();
    }
}