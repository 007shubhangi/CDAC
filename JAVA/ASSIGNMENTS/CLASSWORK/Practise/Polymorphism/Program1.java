//emp has a joining date
import java.time.LocalDate;
import java.util.Scanner;


class Date{
      private int day;
      private int month;
      private int year;

      public Date() {
      LocalDate lt=LocalDate.now();
      this.day=lt.getDayOfMonth();
      this.month=lt.getMonthValue();
      this.year=lt.getYear();
      }
      public Date(int day,int month,int year)
      {
        this.day=day;
        this.month=month;
        this.year=year;
      }
      public void setday(int day){
         this.day=day;
      } 
      public void setmonth(int month){
        this.month=month;
      }
      public void setyear(int year){
        this.year=year;
      }
      public int getday(){
        return this.day;
      }
      public int getmonth(){
        return this.month;
      }
      public int getyear(){
        return this.year;
      }
    //   public String toString(){
    //   return this.year + " " + this.month;
    //  }

}
class Emp{
     int empid;
     float salary;
     Date joinDate=new Date();
    // private Date d1=new Date(); 
    
     public void setempid(int empid){
        this.empid=empid;
     }
     public void setsalary(float salary){
        this.salary=salary;
     }
     public void setjoinDate(Date joinDate ){
        this.joinDate=joinDate;
     }
    public int getempid(){
    return this.empid;
    }
    public float getsalary(){
    return this.salary;
    }
    public Date getjoinDate(){
    return this.joinDate;
    }
    public String toString() {
		String str= this.empid + "  " + this.salary + " " + this.joinDate;
    return str;}
	}
	

class EmpUtils{
   private Emp e=new Emp();
    Scanner sc=new Scanner(System.in);

    public void acceptrecord(){
    System.out.println("enter empid");
    e.setempid(sc.nextInt()); 
    System.out.println("enter salary");
    e.setsalary(sc.nextFloat());

    Date joinDate=this.e.getjoinDate();

    System.out.println("enter day");
    joinDate.setday(sc.nextInt());
    System.out.println("enter month");
    joinDate.setmonth(sc.nextInt());
    System.out.println("enter year");
    joinDate.setyear(sc.nextInt());
    }
    
    public void printrecord(){
		System.out.println("Your ID:: "+e.getempid());
		System.out.println("Your Salary:: "+e.getsalary());
		System.out.println("Your Joining Date:: "+ e.getjoinDate());
    }
    public static int menuList() {
    Scanner sc=new Scanner(System.in);
		System.out.println("0 for Exit");
		System.out.println("1 for Accept");
		System.out.println("2 for Print");
		int choice = sc.nextInt();
		return choice;
	}

}
public class Program1{
    public static void main(String[] args) {
        EmpUtils e1=new EmpUtils();
        int choice;
       while ((choice=EmpUtils.menuList()) !=0){
            switch (choice) {
                case 1:
                e1.acceptrecord();
                    break;
                case 2:
                 e1.printrecord();
                 break;
        
                default:
                    System.out.println("enter invalid number");
            }

       }
      
        
    }
}
