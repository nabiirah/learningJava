import java.util.*;

/** This program will find and print the Diameter and Area of a circle when you provide it with a Radius.
 * NOTE: To import the Scanner utility, I can use [import java.util.*;] to access the entire java utility library 
 * (which includes the Scanner utility), or I can use [import java.util.Scanner;] to access 
 * the Scanner utility specifically.
 * @author Nabiirah
 * @version 12/10/2020
 */

public class CircleApp
{

    public static void main(String[] args)
    {
        System.out.println ("***Circle App***");
        //Above this comment is the title of my program
        double radius, diameter, area;
        final double PI=3.142 ;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        diameter = 2 * radius;
        System.out.println("diameter = " + diameter);
        area = PI * radius * radius;
        System.out.println("Area = "  + area);
        //This program will end after printing the line below
        System.out.println("END OF PROGRAM");
    
    }
    
}