//helper / utility class
//Set_get file reference 

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
    //adhi to local method instance hota main cha
    //now it is feild of class
     //Student S1 = new Student();// INITIALIZATION //S1 is feild * class mdhe lihil mhnun field
     //Student S1; // feild wr constructor cl to initialise karel. null value default* if use then nullpoint exception
      
     //initialise at time of declaration OR  constructor mdhe initializa kara
     //Student S1 = new Student(); //S1 is reference
     Student S1;
     public Helper_utility()
     {
        this.S1 = new Student();
     }
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
}
public class Helper {
    public static void main(String[] args) {
        Helper_utility h1=new Helper_utility();
        h1.acceptrecord();
        h1.printrecord();



    }
}

