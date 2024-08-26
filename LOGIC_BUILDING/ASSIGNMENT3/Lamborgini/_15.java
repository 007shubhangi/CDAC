/*15. Write a program to print the following pattern:
*
**
***
****
*****
*/
/*
class _15{
	 public static void main(String args[])
    {
		int j,i;
        for(i=1;i<=5;i++)
	    {
	      for(j=1;j<=i;j++)
		  {
			System.out.print("*");
				
		  }  
	    System.out.println(" ");
	    }
    }
}
*/
class _15{
	 public static void main(String args[])
    {
		int n=6;
        for(i=1;i<=5;i++)
	    {
	      for(int j=1;j<=i-n;j++)
		  {
		
		    System.out.print(" ");
              for(int j=1;j<=i;j++)
			  System.out.print("* ");
				
		  }  
	    System.out.println(" ");
	    }
    }
}
