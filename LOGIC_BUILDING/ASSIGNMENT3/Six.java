public class Six {
public static void main(String[] args) {
for (int i = 0; i < 5; i++){
System.out.println(i);
System.out.println("Done");
}
}
}
/* Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
include all statements within the loop?
*/

//if we dont give braces for{} only first statement executes
//so it is compulsory to give {} when block have multiple statements