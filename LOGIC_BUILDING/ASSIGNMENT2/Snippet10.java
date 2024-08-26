
public class Snippet10{
public static void display() {
System.out.println("No parameters");
}
public static void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}

// static function cannot call non-static functions 