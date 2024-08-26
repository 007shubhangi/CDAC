 public class One {
public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
      System.out.print(i + " " + j + " ");
    }
 System.out.println();
 }
}
}
// Guess the output of this nested loop.
/*
i   j

1   1     1 1
    2     1 2
	out 1 1 1 2
	  
2   1     2 1
    2     2 2 	
    out 2 1 2 2

3   1     3 1
    2     3 2
    out 3 1 3 2	
	
	  
	  
*/	  
	  