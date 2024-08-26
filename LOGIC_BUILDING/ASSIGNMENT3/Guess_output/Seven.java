public class Seven {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = ++a * b-- - --a + b++;
System.out.println(result);
}
}
// Guess the output of this code snippet.

/*
int a = 10;
int b = 5;
int result = ++a * b-- - --a + b++;
           = 11 * 5 - 10 + 4
		   = 55 - 10 + 4
		   = 55-6
		   = 49
*/