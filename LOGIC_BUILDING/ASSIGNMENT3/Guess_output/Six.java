public class Six {
public static void main(String[] args) {
int x = 5;
int y = ++x - x-- + --x + x++;
System.out.println(y);
}
}
// Guess the output of this code snippet.

/*
  int x = 5;
  int y = ++x - x-- + --x + x++;
        = 6 - 6 + 4 +4
		= 8

*/