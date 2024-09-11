/*1. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.
 */
import java.util.Scanner;
import java.lang.Math.*;

class Loan{
     private double amount;
     private double annualInterestRate;
     private double loanterm;
     private double monthlyInterestRate;
     private double numberOfMonths;
     private double monthlyPayment;

    public void acceptRecord() {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter principal amount");
       this.amount=sc.nextDouble();
       System.out.println("enter rate of intrest");
       this.annualInterestRate=sc.nextDouble();
       System.out.println("enter loanterms in years");
       this.loanterm=sc.nextDouble();
    }
    public void calculateMonthlyPayment() {
        this.monthlyInterestRate = this.annualInterestRate / 12 / 100 ;
        this.numberOfMonths = this.loanterm * 12;
        this.monthlyPayment = this.amount * (this.monthlyInterestRate * Math.pow((1 + this.monthlyInterestRate),(this.numberOfMonths))) / Math.pow((1 + this.monthlyInterestRate),(this.numberOfMonths) - 1);
    }
    public void printRecord() {
     System.out.println("monthly payment " + this.monthlyPayment );
     System.out.println(" total amount paid " + this.amount);
    }

}
public class Program1{

    public static void main(String[] args) {
        Loan L1=new Loan();
        L1.acceptRecord();
        L1.calculateMonthlyPayment();
        L1.printRecord ();
    }
    
}

