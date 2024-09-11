
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
      public double originalPrice;
      public double discountRate;
      public double discountAmount;
      public double finalprice;

    DiscountCalculator(){ }
    public void setoriginalPrice(double originalPrice){
        this.originalPrice=originalPrice;
    }
    public void setdiscountRate(double  discountRate){
        this.discountRate=discountRate;
    }
    public double getoriginalPrice(){
        return this.originalPrice;
    }
    public double getdiscountRate(){
        return this.discountRate;
    }

}
class Helperutility {

     private DiscountCalculator D1=new DiscountCalculator();
    public void acceptRecord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter original price of item");
        D1.setoriginalPrice(sc.nextDouble());
        System.out.println("enter discount percentage");
        D1.setdiscountRate(sc.nextDouble());}

        public void calculateDiscount(){
        D1.discountAmount = D1.originalPrice * (D1.discountRate / 100);
        D1.finalprice = D1.originalPrice - D1.discountAmount;
        }
       
         public void printRecord(){
        System.out.println("discount amount is " + D1.discountAmount + " Rs" + " and " + " final price : " + D1.finalprice + " Rs");
         }

         public String toString(){
            String str="discount amount is " + D1.discountAmount + " Rs" + " and " + " final price : " + D1.finalprice + " Rs";
         return str; 
        }
    }


public class Program4{
    public static void main(String[] args) {
        Helperutility h1=new Helperutility();
        h1.acceptRecord();
        h1.calculateDiscount();
        System.out.println(h1.toString());   
        h1.printRecord();
    }
}