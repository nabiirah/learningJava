import java.util.Scanner;

/** This program will compare if the two inputed numbers are equal.
 * @author Nabiirah
 * @version 26/10/2020
 */



public class TimesTableApp
{

    public static void main(String[] args)
    {
     int timesTable;
     Scanner sc = new Scanner (System.in);
   
    
     System.out.print("What times table would you like to see? ");
     timesTable = sc.nextInt();
    
     // This is the best place to add a data validation check. A while loop can be used for this.
     while ( timesTable > 100 || timesTable < 2)
     {
         System.out.println("INVALID DATA: Please enter anumber between 2 - 100 only");
           System.out.print ("Please re-enter: ");
           timesTable = sc.nextInt();
     }
     for (int i =1 ; i <= 12  ; i++  ) // ++ will increment by 1.
     {
         System.out.println(timesTable + " x " + i + " = " + (timesTable * i));
     }
     
     System.out.println("END OF PROGRAM");
    }
}