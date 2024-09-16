
import java.util.Scanner;

/*3.Design and implement a class named Employee to manage 
employee data for a company. The class should include fields 
to keep track of the total number of employees and the total
salary expense, as well as individual employee details such
as their ID, name, and salary.
The class should have methods to:
•	Retrieve the total number of employees (getTotalEmployees())
•	Apply a percentage raise to the salary of all employees
 (applyRaise(double percentage))
•	Calculate the total salary expense, including any raises
 (calculateTotalSalaryExpense())
•	Update the salary of an individual employee
 (updateSalary(double newSalary))
Understand the problem statement and use static and non-static
 fields and methods appropriately. Implement static and non-static 
 initializers, constructors, getter and setter methods, and
a toString() method to handle the initialization and 
representation of employee data.
Write a menu-driven program in the main method to test the 
functionalities.
*/
class Employee{
    public String name;
    public int ID;
    public float salary;
    float newSalary;
    public int totalEmployees;
    float totalSalaryExpenses;
    public Employee(){}
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return this.ID;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public float getSalary(){
        return this.salary;
    }
    public String toString(){
        return this.name+ " "+this.ID+" "+this.salary;
    }
}
class EmployeeUtils{
    Scanner sc=new Scanner(System.in);
    Employee e1=new Employee();

    public int getTotalEmployees(){
       return e1.totalEmployees;
    }
    public void calculateTotalSalaryExpense()
   {
    float Salary =e1.getSalary();
    if(Salary >1000){
        e1.newSalary =(Salary*2)/100;
    }
   }
   public static int menu(){
    Scanner sc=new Scanner(System.in);
    System.out.println("0.exit");
    System.out.println("1.acceptDetails");
    System.out.println("2.calculateTotalSalaryExpense");
    int choice=sc.nextInt();
    return choice;
   }
}
class Q3{
    public static void main(String[] args) {
        EmployeeUtils   e1=new EmployeeUtils();

      }
}