public class Four {
public static void main(String[] args) {
int i = 1;
do {
System.out.print(i + " ");
i++;
} while (i < 5);
System.out.println(i);
}
}
// Guess the output of this do-while loop.
/*

  i=1;
  1 
  i++; // 2
  
  2<5 (true)
  2
  i++; //3
  
  3<5 (true)
  3
  i++; //4
  
  4<5
  4
  i++ //5
  
  5<5 (false)
 
1 2 3 4 i = 5
 */