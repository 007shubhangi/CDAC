
import static java.lang.Math.pow;
import java.util.Scanner;

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
   CompoundInterestCalculator(){
  }
  public void setPrincipal(double principal)
  {
    this.principal=principal;
  }
  public void setAnnualInterestRate(double annualInterestRate)
  {
    this.annualInterestRate=annualInterestRate;
  }
  public void setNumberOfCompounds(double numberOfCompounds)
  {
    this.numberOfCompounds=numberOfCompounds;
  }
  public void setYears(double years)
  {
    this.years=years;
  }
}
class HelperUtility{
  private CompoundInterestCalculator c1= new CompoundInterestCalculator();
  private Scanner sc = new Scanner(System.in);

  public void acceptRecord(Scanner sc){
    System.out.println("enter principal amount");
    c1.setPrincipal(sc.nextDouble());

    System.out.println("enter annual interest rate");
    c1.setAnnualInterestRate(sc.nextDouble());

    System.out.println("enter number of times the interest is compounded per year");
    c1.setNumberOfCompounds(sc.nextDouble());

    System.out.println("enter investment duration (in years)");
    c1.setNumberOfCompounds(sc.nextDouble());
   }

   public void CompoundInterestCalculator(){
    c1.futureValue = c1.principal * (pow(1 + (c1.annualInterestRate / c1.numberOfCompounds), pow(c1.numberOfCompounds, c1.years)));
    c1.totalInterest = c1.futureValue - c1.principal;
  }

    public static double menuList(){
      Scanner sc=new Scanner(System.in);
      System.out.println("0.exit()");
      System.out.println("1.Acceptrecord()");
      System.out.println("2.Printrecord()");
       double choice =sc.nextDouble();
       return choice;
    }
    public void printRecord(){
      System.out.println("future value " +  c1.futureValue + " " + " Rs ");
      System.out.println(" the total interest earned " + c1.totalInterest + " Rs");
      }

    // public String toString(){
    //   return c1.futureValue + " " + c1.totalInterest;
    // }
}
public class Program2 {
    public static void main(String[] args) {
      HelperUtility h1=new HelperUtility();
      Scanner sc=new Scanner(System.in);

      double choice;
      while ((choice = HelperUtility.menuList())!=0)
      {
        switch((int)choice){
          case 1:
          h1.acceptRecord(sc);
          break;

          case 2:
          h1.printRecord();
          break;

          default:
          System.out.println("Invalid ");
        }
      //  System.out.println(h1.toString());

      }
    }
}
