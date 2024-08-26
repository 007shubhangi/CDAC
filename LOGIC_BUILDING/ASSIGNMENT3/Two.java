public class Two {
public static void main(String[] args) {
int count = 5;
while (count == 0) {
System.out.println(count);
count--;
}
}
}
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
//`while` loop?

//incompatible types 
//while(0) in java 0,1 are integers 
	
// we cant assign