/*
19. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/
class _19{
     public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
	    {
	      for(int j=1;j<=i;j++)
	       {
			   if(j>1){
			   System.out.print("*");
			   }
	        System.out.print(j);
			} 
	    System.out.println(" ");
	    }
    }
	
}
/*
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/