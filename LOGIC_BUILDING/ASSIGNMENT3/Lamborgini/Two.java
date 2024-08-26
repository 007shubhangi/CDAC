//2. Write a program to compute the factorial of the number 10.
class Two{
     public static void main(String args[])
    {
		int fact=1;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);//3628800
    }
}


/*
import java.util.Scanner;
class Two{
     public static void main(String args[])
     {
		Scanner sc= new Scanner(System.in);
		System.out.println("whose factorial you want??");
		int num = sc.nextInt();
		int fact=1;
        for(int i=1; i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("fact of 10 : "+ fact);
    }
}
*/