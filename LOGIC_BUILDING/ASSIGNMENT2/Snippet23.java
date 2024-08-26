public class Snippet23 {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
}

//expression match with case 2. so case 2 statments executes but break statement is missing. so cases after case 2 also executed