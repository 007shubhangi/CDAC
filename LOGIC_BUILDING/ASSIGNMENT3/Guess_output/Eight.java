public class Eight {
public static void main(String[] args) {
int count = 0;
for (int i = 0; i < 4; i++) {
count += i++ - ++i;       
/*
i=0
count = 0+0-2
      = -2
	  
i=3
count = -2+3-5
      = -4	  
	  
i=4
4<4 false	  
*/	  
	  
}
System.out.println(count); // -4
}
}
// Guess the output of this code snippet.