/*14. Write a program to print the following pattern:
*
**
***
*****
*******
*********
*/
class _14{
	public static void main(String args[]){
		
		System.out.println("*");
		System.out.println("**");
		for(int i=3;i<=9;i+=2){
			
			for(int j=1;j<=i;j++){
				
				System.out.print("*");
				
			}
			System.out.println(" ");
			
		} 
	}
}