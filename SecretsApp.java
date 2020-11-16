import java.util.Scanner;

/** This program will tell you a secret depending on your security level.
 * @author Nabiirah
 * @version 19/10/2020
 */

public class SecretsApp
{

    public static void main(String[] args)
    {
       int securityLevel;
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter your security level: ");
       securityLevel = sc.nextInt();
       switch (securityLevel)
       {
           case 1:  System.out.println("Security guard is a robot");break;
           case 2:  System.out.println("There is a secret room in the basement"); break;
           case 3:  System.out.println("The cook is an alien"); break;
           default: System.out.println("NO SUCH LEVEL");//In the real world scenario, it's ideal to give the user guidelines as to what you expect them to enter in this field.
       }
       System.out.println ("END OF PROGRAM");
    }
}
