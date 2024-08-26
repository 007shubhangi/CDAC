public class Three {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num > 0);
}
}
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile`
//loop?
//first do loop body execute then condition will check. (1>0) condition is true hence loop execute infinite