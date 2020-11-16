import java.util.Scanner;

/** This program will compare if the two inputed numbers are equal.
 * @author Nabiirah
 * @version 19/10/2020
 */



public class CompareApp
{

    public static void main(String[] args)
    {
       int num1, num2;
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter first number: ");
       num1 = sc.nextInt();
       System.out.print("Enter second number: ");
       num2 = sc.nextInt();
       if(num1 == num2) // Reminder: One equals sign is used for assigning variables. Two equals signes are used to check if the values of two things are equal.
       {
           System.out.println("Numbers ARE equal");
       }
       else
       {
           System.out.println("Numbers ARE NOT equal");
       }
       
     System.out.println("END OF PROGRAM");
     
    }
    
}