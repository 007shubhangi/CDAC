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

class Loan{
     double amount;
     double annualInterestRate;
     double loanterm;
     double monthlyInterestRate;
     double numberOfMonths;
     double monthlyPayment;

public void setamount(double setamount) {
    this.amount=setamount;
}
    
public void setannualInterestRate(double annualInterestRate ) {
    this.annualInterestRate=annualInterestRate;
}
public void setloanterm(double loanterm) {
    this.loanterm=loanterm;
}
public double getamount(){
    return this.amount ;
}

public double getannualInterestRate() {
    return this.annualInterestRate;
}

public double getloanterm(){
   return this.loanterm;
}
}
class  HelperUtilityLoan{
    Loan monthlypayment=new Loan();
    Scanner sc=new Scanner(System.in);

     public void acceptRecord(){

     System.out.println("enter principal amount");
     monthlypayment.setamount(sc.nextDouble());

     System.out.println("enter annual interest");
     monthlypayment.setannualInterestRate(sc.nextDouble());

     System.out.println("enter loanterm");
     monthlypayment.setloanterm(sc.nextDouble());

    }
     
    public void printRecord(){
        System.out.println(monthlypayment.getamount());
        System.out.println(monthlypayment.getannualInterestRate());
        System.out.println(monthlypayment.getloanterm());
    }

    public double calculateMonthlyPayment() {
    monthlypayment.monthlyInterestRate = monthlypayment.annualInterestRate / 12 / 100 ;
    monthlypayment.numberOfMonths = monthlypayment.loanterm * 12;
    monthlypayment.monthlyPayment = monthlypayment.amount * (monthlypayment.monthlyInterestRate * (1 + monthlypayment.monthlyInterestRate) pow(monthlypayment.numberOfMonths)) / ((1 + monthlypayment.monthlyInterestRate) pow(monthlypayment.numberOfMonths) - 1);
    return monthlypayment.monthlyPayment;
}
}

public class Program1{
    public static void main(String[] args) {
       HelperUtilityLoan loan=new HelperUtilityLoan();
       loan.acceptRecord();
       loan.printRecord();
       System.out.println(loan.calculateMonthlyPayment());

    }
}
