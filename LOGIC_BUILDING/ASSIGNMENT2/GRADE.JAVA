/*
Question 1: Grade Classification

Write a program to classify student grades based on the following criteria:
 If the score is greater than or equal to 90, print "A"
 If the score is between 80 and 89, print "B"
 If the score is between 70 and 79, print "C"
 If the score is between 60 and 69, print "D"
 If the score is less than 60, print "F"
*/
  

class Grade{
     public static void main(String args[]){
            //int grade=75;
              int grade=55;

            if (grade>=90){
            System.out.println("A");
            }
             
            else if(grade>80 && grade<89){
            System.out.println("B");
            }

            else if(grade>70 && grade<79){
            System.out.println("C");
            }

            // int num=100; error else without if

            else if(grade>60 && grade<69){
            System.out.println("D");
            }

            else{
            System.out.println("FAIL");
            }

  }
}

