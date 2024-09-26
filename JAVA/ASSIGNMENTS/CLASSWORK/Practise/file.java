//Instance field initializer
//when we define multiple contr and value of field is same in all cotr then make that
// field instance initializer field
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Test{
    private int num1=10; //instance field initializer
    private int num2;
    private int num3;
    public Test()
    {
        try {
            //this.num1=10; value same in both instance so initialize at field
            String pathname = "./file.txt";
            //to read file create obj of FIle class
            File file=new File(pathname);
            Scanner sc=new Scanner(file);
            this.num2 = sc.nextInt();
            
            
        } catch (FileNotFoundException ex) {
        }
        num3=30;
    }
    public Test(int num3)
    {
        try {
            //this.num1=10;
            String pathname = "./file.txt";
            //to read file create obj of FIle class
            File file=new File(pathname);
            Scanner sc=new Scanner(file);
            this.num2 = sc.nextInt();
            
            
        } catch (FileNotFoundException ex) {
        }
        this.num3=num3;
    }


    public void printrecord()
    {
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}

public class file {
    public static void main(String[] args) {
    Test t1=new Test();
    t1.printrecord();
System.out.println("***********************************");
    Test t2=new Test(300);
    t2.printrecord();


    }
}
