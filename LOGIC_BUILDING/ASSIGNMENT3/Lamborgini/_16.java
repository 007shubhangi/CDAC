/*
16. Write a program to print the following pattern:
*       
***
*****
*******
*********
*/
/*
class _16{
	 public static void main(String args[])
    {
		int j,i;
        for(i=1;i<=10;i++)
	    {
	      for(j=1;j<=i;j++)
		  {
			if (i%2==0)
			   break;	
			System.out.print("*");
				
		  }  
	    System.out.println(" ");
	    }
    }
}
*/
/*
*

***

*****

*******

*********
*/

class _16{
	 public static void main(String args[])
    {
		int j,i;
        for(i=1;i<=9;i=i+2)
	    {
	      for(j=1;j<=i;j++)
		  {	
			System.out.print("*");	
		  }  
	    System.out.println(" ");
	    }
    }
}



