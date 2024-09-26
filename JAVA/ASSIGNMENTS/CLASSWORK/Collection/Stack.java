import java.util.*;
public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> str=new java.util.Stack<Integer>();
        java.util.Vector<Integer> str1=new java.util.Stack<Integer>();
        java.util.Vector<Integer> str6=new java.util.Vector<Integer>();
        java.util.List<Integer> str2=new java.util.Stack<Integer>();
       // java.util.ArrayList<Integer> str3=new java.util.Stack<Integer>();not ok



        System.out.println(str.isEmpty());//true
        System.out.println(str.empty());//true

        str.push(88);
        str.push(55);
        str.push(45);

        System.out.println(str.toString());//[88, 55, 45]

        System.out.println(str.pop());//45
        System.out.println(str.peek());//55

        System.out.println(str.empty());
        System.out.println(str.isEmpty());

        
    }
}
