//5. Write a program to print the Fibonacci sequence up to the number 21.
class Fibonacci{
	public static void main(String args[]){
		int num1=0;
		int num2=1;
		int num3;
		int i = 2;
		int count=21;
		
		System.out.print(num1+" "+num2);
		
		for(i=2;i<=count;++i){
			
			num3=num1+num2;
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
			
		}
		
	}
}