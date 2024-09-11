/*  Q3 3. BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method.
*/
import java.util.Scanner;
import javax.swing.plaf.basic.BasicHTML;

class BMI{
     double weight;
     double height;

    Scanner sc = new Scanner(System.in);
    
    public BMI()
    {
    }
    
    public void setWeight(double  weight) {
        this.weight=weight;
    }

    public void setHeight(double  height) {
      this.height=height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }
}
class BMITrackerUtil {
    Scanner sc = new Scanner(System.in);
    BMI B1=new BMI();

    public void acceptRecord()
    {
        System.out.println("enter height in meter");
        double height = sc.nextDouble();
        B1.setHeight(height);

        System.out.println("enter weight in kg");
        double weight=sc.nextDouble();
        B1.setWeight(weight);
    }
    public void  printRecord()
    {
        System.out.println(B1.getHeight());
        System.out.println(B1.getWeight());
    }
    public double menuList(){
        double BMI = B1.weight/(B1.height*B1.height);
        return BMI;
    }
   
}
public class Program3{
    public static void main(String[] args) {
    BMITrackerUtil B1 = new BMITrackerUtil();
    B1.acceptRecord();
    //B1.printRecord();
    double BMI = B1.menuList();

    if (BMI < 18.5){
        System.out.println("underweight");
    }
    else if ( BMI >= 18.5  || BMI < 24.9){
       System.out.println("normal weight");
    }
    else if ( BMI >= 25 || BMI < 29.9){
        System.out.println("overweight");
       }
    else if (BMI >= 30){
        System.out.println("obese");
    }
     else{
          System.out.println("enter values again");     
     }
     
}
}
