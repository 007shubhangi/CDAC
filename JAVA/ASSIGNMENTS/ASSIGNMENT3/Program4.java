
import java.util.Scanner;

/*4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define class DiscountCalculator with methods acceptRecord, calculateDiscount & printRecord and test the functionality in main method.
 */

class DiscountCalculator{
      double originalPrice;
      double discountRate;
      double discountAmount;
      double  finalprice;

    public void acceptRecord(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter original price of item");
     this.originalPrice=sc.nextDouble();
     System.out.println("enter discount oercentage");
     this.discountRate=sc.nextDouble();

    }
    public void calculateDiscount(){
        this.discountAmount = originalPrice * (discountRate / 100);
        this.finalprice = originalPrice - discountAmount;
    }
    // public String toString(){
    //   return "discount amount is " + this.discountAmount + "₹" + " final price : " + this.finalprice + "₹";
    // }
     public void printRecord(){
        System.out.println("discount amount is " + this.discountAmount + " Rs" + " final price : " + this.finalprice + " Rs");
     }
}
public class Program4{
    public static void main(String[] args) {
        DiscountCalculator D1=new DiscountCalculator();
        D1.acceptRecord();
        D1.calculateDiscount();
        //System.out.println(D1.toString());   ok    
        D1.printRecord();
    }
}
