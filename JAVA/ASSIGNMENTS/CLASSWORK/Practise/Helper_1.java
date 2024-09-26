//helper / utility class
//Set_get file for reference 
//helper_1 for refernce
//Menudriven program 

import java.util.Scanner;

class Student{
    String name;
    int studentid;

    public void setname(String name){
        this.name=name;
    }
    public void setstudentid(int studentid)
    {
        this.studentid=studentid;
    }
    public String getname()
    {
     return  this.name;
    }
    public int getid()
    {
     return  this.studentid;
    }
}
//helper class
class Helper_utility{
     //initialise at time of declaration OR  constructor mdhe initializa kara
     private Student S1 = new Student(); //S1 is reference
     /* 
     Student S1;
     public Helper_utility()
     {
        this.S1 = new Student();
     }
     */
    static Scanner sc=new Scanner(System.in);//pratek thikani linyapeksha eth liha 
    //set method set/ accept modify instance statte
    public void acceptrecord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        S1.setname(sc.nextLine());
        System.out.println("enter id");
        S1.setstudentid(sc.nextInt());
    } 
    //get method read get state of isntanve var
    public void printrecord(){
        System.out.println(S1.getname());
        System.out.println(S1.getid());
    }

   public static int menuList(){
     System.out.println("0.Exit");
     System.out.println("1:acceptrecord");
     System.out.println("2:printrecord");
     System.out.println("enter choice");
     int choice =sc.nextInt();
     return choice;

    }
}
public class Helper_1 {
    public static void main(String[] args) {
        int choice;
        Helper_utility h1=new Helper_utility();

        while ( ((choice = Helper_utility.menuList( )) !=0))
        {
           switch (choice) {
               case 1:
                   h1.acceptrecord();
                   break;
                case 2 :
                h1.printrecord();
                break;   
               default:
                   throw new AssertionError();
           }
        }
        h1.acceptrecord();
        h1.printrecord();



    }
}

