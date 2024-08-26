public class Five {
public static void main(String[] args) {
for (int i = 10; i >= 0; --i) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the
//initialization and update statements in the `for` loop?

//Infinite loop
/*
10
9
8
7
6
5
4
3
2
1
0
*/