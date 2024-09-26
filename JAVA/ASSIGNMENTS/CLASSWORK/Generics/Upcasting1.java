public class Upcasting1 {
    public static void main(String args[]){
        int num=10;
        //Integer i=num;
        Integer i=Integer.valueOf(num);
        //Integer i=new Integer(i);
        System.out.println(i);

        String str="123";
        int num1=Integer.parseInt(str);
        System.out.println(num1);

        int number=12354;
        String str1=String.valueOf(number);
        String str12=Integer.toString(number);

        int num2=100;
        Object obj=num2;
        //Integer i=Integer.valueof(num2);
        //obj=i;

        // Integer i1=new Integer(102);
        // int num5=i.valueOf(i1);
    }
}
