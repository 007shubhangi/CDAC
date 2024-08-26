/*
Question 2: Days of the Week

Write a program that uses a nested switch statement to print out the day of the week based on an
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
is a weekday or weekend.
*/

public class Days {
public static void main(String[] args) {

int day = 2;
switch(day) {

case 0:
System.out.println("SUNDAY!");
System.out.println("WEEKEND!");

break;

case 1:
System.out.println("MONDAY!");
System.out.println("WEEKDAY!");

break;

case 2:
System.out.println("TUESDAY!");
System.out.println("WEEKDAY!");
break;

case 3:
System.out.println("WENDSDAY!");
System.out.println("WEEKDAY!");
break;

case 4:
System.out.println("THURSDAY!");
System.out.println("WEEKDAY!");
break;

case 5:
System.out.println("FRIDAY!");
System.out.println("WEEKDAY!");
break;

case 6:
System.out.println("SATURDAY!");
System.out.println("WEEKEND!");
break;

default:
System.out.println("INVALID!");
}
}
}
