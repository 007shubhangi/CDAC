/* 3. BMI (Body Mass Index) Tracker
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
import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.Soundbank;

class BMITracker{
    private double height;
    private double weight;

    public void acceptRecord(Scanner sc)
    {
        System.out.println("enter height");
        this.height = sc.nextDouble();
        System.out.println("Enter weight");
        this.weight=sc.nextDouble();

    }
    public double  printRecord()
    {
     double BMI = (this.weight)/(this.height*this.height);
     return BMI;

    }
}

public class Program3{
    public static void main(String[] args) {
        BMITracker B1= new BMITracker();
        Scanner sc = new Scanner(System.in);
        B1.acceptRecord(sc);
        double BMI=B1.printRecord();
        if (BMI<18.5){
          System.out.println("underweight");}
        else if (BMI >=18.5 && BMI<24.9) {
            System.out.println("normal weight");}
        else if(BMI >=25 && BMI<29.9){
         System.out.println("overweight"); 
         }
         else if(BMI>30)
          System.out.println("obese");
          else
          System.out.println("enter avlue again");
        
    }
}


    

