
import java.util.Scanner;
import static java.lang.Math.pow;

/*
2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded
 per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , acceptRecord, printRecord and test the functionality in main method.

 */
class CompoundInterestCalculator {
  double principal;
  double annualInterestRate;
  double numberOfCompounds;
  double years;
  double futureValue;
  double totalInterest;

  public void acceptRecord(Scanner sc){
   System.out.println("enter principal amount");
   this.principal=sc.nextDouble();
   System.out.println("enter annual interest rate");
   this.annualInterestRate=sc.nextDouble();
   System.out.println("enter number of times the interest is compounded per year");
   this.numberOfCompounds=sc.nextDouble();
   System.out.println("enter investment duration (in years)");
   this.years=sc.nextDouble();

  }
  public void CompoundInterestCalculator(){
    futureValue = principal * (pow(1 + (this.annualInterestRate / this.numberOfCompounds), pow(this.numberOfCompounds, this.years)));
    totalInterest = this.futureValue - this.principal;
  }
  public void printRecord(){
  System.out.println("future value " +  this.futureValue + " " + " Rs ");
  System.out.println(" the total interest earned " + this.totalInterest + " Rs");
  }
}
public class Program2 {
    public static void main(String[] args) {
        CompoundInterestCalculator c1= new CompoundInterestCalculator();
        Scanner sc = new Scanner(System.in);
        c1.acceptRecord(sc);
        c1.CompoundInterestCalculator();
        c1.printRecord();
    }
}
