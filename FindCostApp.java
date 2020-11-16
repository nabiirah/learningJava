import java.util.Scanner;

/** This program will request input from the user for a price and tax amount. It will then calculate the price after after tax..
 * @author Nabiirah
 * @version 02/11/2020
 */

public class FindCostApp
{
   public static void main(String[ ] args ) //main method       
   {
                Scanner kbd= new Scanner(System.in); 
                double price = 0, tax = 0;
                
		displayTitle(); // This calls method 2
		
		price = getPrice(price); // This calls method 3
		
		tax = getTax(tax); // This calls method 4
		
                price = calculatePrice(price, tax); // This calls method 5
		
                blankLine(); // This calls method 6
                
		displayPrice(price); // This calls method 7
    }
   
   static void displayTitle() //method 2
   {
       System.out.println("*** Product Price Check ***");
       blankLine();
       blankLine();
   }
   
    static double getPrice(double priceIn) //method 3
   {
       System.out.print("Enter initial price: ");
       Scanner kbd = new Scanner(System.in);
       priceIn = kbd.nextDouble();
       return priceIn;
   }
   
   static double getTax(double taxIn) //method 4
   {
       System.out.print("Enter tax rate: ");
       Scanner kbd = new Scanner(System.in); 
       taxIn = kbd.nextDouble();
       return taxIn;
   }  
   
   static double calculatePrice(double priceIn, double taxIn) ///method 5
   {
       return priceIn * (1 + taxIn/100);
   }
   
    static void blankLine() //method 6
   {
       System.out.println();
   }
    
    static void displayPrice(double priceIn) //method 7
   {
       System.out.println("Cost after tax = " + priceIn);
   }
}






   


