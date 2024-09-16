/*
1)Create a base class BankAccount with methods like deposit()
 and withdraw(). 
Derive a class SavingsAccount that overrides 
 the withdraw() method to impose a limit 
on the withdrawal amount. Write a program that demonstrates the use of overridden 
methods and proper access modifiers & return the details.
 */
class BankAccount{
    String firstName;
    String lastName;
    int accountNo;
    double amount;
    static double limit=100000;

    public BankAccount(String firstName,String lastName,
    int accountNo,double ammount,double limit){
    this.firstName=firstName;
    this.lastName=lastName;
    this.accountNo=accountNo;
    this.amount=amount;
    //this.limit=limit;
    }
    public void deposit(){

    }
    public int withdraw(){

    }
}
class SavingsAccount extends BankAccount{
    public int withdraw(){
    System.out.println(BankAccount.limit);
    }
}
class Q1{
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
    }
}