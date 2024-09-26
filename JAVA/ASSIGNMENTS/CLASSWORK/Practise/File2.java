//Instance block initializer
//num1 and num2 value same 
//but num is block 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Test{
    private int num1=10; //instance field initializer
    private int num2;
    private int num3;
    
  
    {//intance initialixer block
        try {
            System.out.println("inside inititializer block");
            String pathname = "./file.txt";
            //to read file create obj of FIle class
            File file=new File(pathname);
            Scanner sc=new Scanner(file);
            this.num2 = sc.nextInt();
            
            
        } catch (FileNotFoundException ex) {
        }
       
    }
    public Test( )
    { 
        this.num3=30;
    }
    public Test(int num3)
    {
        this.num3=num3;
    }


    public void printrecord()
    {
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}

public class File2{
    public static void main(String[] args) {
    Test t1=new Test(); //order of execution when instance creater: 1.instance field initializer ;
                         //execute 2.instance block initializer 3 parameterless contr;
    t1.printrecord();
System.out.println("***********************************");
    Test t2=new Test(300);
    t2.printrecord();


    }
}

