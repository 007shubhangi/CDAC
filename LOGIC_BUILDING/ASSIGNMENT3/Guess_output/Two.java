public class Two {
public static void main(String[] args) {
int total = 0;
for (int i = 5; i > 0; i--) 
{
total += i;
if (i == 3) 
	continue;
total -= 1;
}

System.out.println(total);
}
}
// Guess the output of this loop.
/*
    total = 0
    i = 5 , 5>0 
    total = total + i
         = 0 + 5
    total	 = 5
	
	total = total - 1
	      = 4
		  

    i = 4	4>0	
    total = total + i
          = 4 + 4
    total = 8
	
	total = total - 1
	      = 8 - 1
          = 7

    i = 3	3>0	
    total = total + i
          = 7 + 3
    total = 10
	
	i == 3
	continue
	
    i = 2	2>0	
    total = total + i
          = 10 + 2
    total = 12
	
	total = total - 1
	      = 12 - 1
          = 11	
		  
    i = 1	1>0	
    total = total + i
          = 11 + 1
    total = 12
	
	total = total - 1
	      = 12 - 1
          = 11	

TOTAL = 11		  

*/		  
		  
	
	
		  
		  
	
	