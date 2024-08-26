public class Twelve {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2; //0 2 4 6 8 
}
System.out.println(x); // Error: 'x' is not accessible here
}
}
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
// x is accesible only inside for loop. We cant access it outside the for loop body