/*
2)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).
*/
import java.util.Scanner;
class Q2{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height in meters ");
		double height = sc.nextDouble();
		System.out.println("enter weight in kg");
		double weight = sc.nextDouble();		
		
		double BMI = weight/(height*height);
		System.out.println(BMI);
		
		if (BMI<18.5)
			System.out.println("underweight");
		
		else if(BMI>=30)
			System.out.println("overweight");
		
		else if(BMI>=18.5 && BMI<=24.9)
			System.out.println("normal weight");
		
		else 
			System.out.println("Something went wrong!!");
			
		
	}
}