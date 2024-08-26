/*22. Write a program to print the following pattern:
*********
*******
*****
***
*
***
*****
*******
*********
*/
class TwentyTwo{
	 public static void main(String args[])
    {
		
        for(int i=1;i<=9;i++)
	    {
	      for(int j=9;j>=i;j--)
	       {
			System.out.print("*");			
	       } 
	    System.out.println(" ");
	    }
    }
}