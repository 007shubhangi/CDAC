/*
Question 5: Student Pass/Fail Status with Nested Switch
Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or more subjects, print the number of subjects they failed in.*/

public class Student{
        public static void main(String args[]){
        int math=55, eng=60, java=66,count=0;

        if (math>40){
         count=count+1;
        }

        if (eng>40){
         count=count+1;
        }
   
        if (java>40){
         count=count+1;
        }

        if (count==3){
          Sustem.out.println("PALL IN ALL SUB");}
  
        if (count==2){
          Sustem.out.println("FAIL IN ONE SUB");}

        if (count==){
          Sustem.out.println("FAIL IN TWO SUB");}
       
       
     }
}