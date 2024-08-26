public class Three {
public static void main(String[] args) {
int count = 0;
  while (count < 5)
  {
   System.out.print(count + " ");
   count++;
    if (count == 3) 
		break;
  }
System.out.println(count);
}
}
// Guess the output of this while loop.

/* 

   count = 0;
   (0<5) true
   0 
   
   count++ 
   count = 1
   (1<5)
   1
   
   count++
   count=2
   (2<5)
   2
   
   count++
   count=3
   3==3 terminate while loop
   
 out 0 1 2
 count(3)
   */