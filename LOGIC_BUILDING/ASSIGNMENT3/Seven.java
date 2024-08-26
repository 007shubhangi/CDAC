public class Seven {
public static void main(String[] args) {
int count=5;
while (count < 10) {
System.out.println(count);
count++;
}
}
}
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop
//variable properly?

// count is local variable. It is mandatory to intialize variable.
// *No garbage value in JAVA*

