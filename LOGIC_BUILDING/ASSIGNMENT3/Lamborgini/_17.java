/*
17. Write a program to print the following pattern:
*****
****
***
**
*
*/
class _17{
	 public static void main(String args[])
    {
		int j,i;
        for(i=1;i<=5;i++)
	    {
	      for(j=5;j>=i;j--)
		  {
			System.out.print("*");
				
		  }  
	    System.out.println(" ");
	    }
    }
}
/*
*****
****
***
**
*
*/