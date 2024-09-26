//*CONSTRUCTOR CHAINING : call one constructor form another constructor
class Time{
     float sec;
     float min;
     float hr;
     
     public Time()
     {
        this(0,0);
     }

     public Time(float num, float  num1)
     {
        this.sec=num;
        this.min=num1;
     }
     public Time(float num1 , float num2 , float num3)
     {
        this.sec = num1;
        this.min = num2;
        this.hr = num3;
     }

     public void printTime()
     {
       System.out.println("sec : " + this.sec + " min : " + this.min + " sec : " + this.hr);
     }

}

public class Constr_Chain{
public static void main(String[] args) {
    Time t1 = new Time();
    t1.printTime();

    Time t2 = new Time(10.10f , 12.30f , 12.33f);
    t2.printTime();

}
}