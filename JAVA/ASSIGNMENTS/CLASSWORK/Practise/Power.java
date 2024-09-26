import java.lang.Math;

class ToCalculatePower{
 public double acceptvalue(double base,double exponent)
 {
    double result=1;
    for( int count = 1; count <= exponent; ++ count )
			result = result * base;
    return result;
 }

public static void main(String[] args) {
    ToCalculatePower p1=new ToCalculatePower();
    System.out.println(p1.acceptvalue(10,2));

}
}
