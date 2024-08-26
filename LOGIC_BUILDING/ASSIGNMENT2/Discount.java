/*
Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount.
Additionally, if the user has a membership card, increase the discount by 5%.
*/

public class Discount{
   public static void main(String args[]){

      int total=400;
      boolean membership=false;
      
      if (total>=1000){
       total=total-total*20/100;
       if (membership==true){
           total=total-total*5/100;}
       System.out.println("TOTAL PURCHASE WITH DISCOUNT IS " + total);
      }

      else if(total>500 && total<999){
       total=total-total*10/100;
          if (membership==true){
           total=total-total*5/100;}
          System.out.println("TOTAL PURCHASE WITH DISCOUNT IS " + total);
      }

      else if (total<500){
       total=total-total*5/100;
       if (membership==true){
           total=total-total*5/100;}
         System.out.println("TOTAL PURCHASE WITH DISCOUNT IS " + total);
      }

      else {
        System.out.println("NO DISCOUNT ON" + total);}

   }
}
