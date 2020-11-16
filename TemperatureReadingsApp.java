import java.util.Scanner;

/**  This program will request the temperature in Degree Celsius from the the user. Then display the entered temperatures. Then convert the temperatures to Farenheit. And lastly display the entered temperatures in Farenheit. 
 * @author Nabiirah
 * @version 09/11/2020
 */

public class TemperatureReadingsApp
{
	 public static void main(String[] args)
	 {
             double[] temperature = new double[7]; 
	     enterTemps(temperature); 
	     displayTemps(temperature);
             wasHot(temperature);
             convertToFarenheit(temperature);
             displayTemps(temperature);
	 }
	
	 static void enterTemps(double[] temperatureIn)
	 {
	     System.out.println(); 
             System.out.println("*** ENTER TEMPERATURES ***");
	     
             Scanner keyboard = new Scanner(System.in);
             for (int i = 0; i < temperatureIn.length; i++)
	     {
                 System.out.print("Enter max temperature for day " + (i+1) + ": ");
	         temperatureIn[i] = keyboard.nextDouble();
	     }
	 }
	
	 static void displayTemps(double[] temperatureIn)
	 {
	     System.out.println(); 
	     System.out.println("*** TEMPERATURES ENTERED ***");
	     for (int i = 0; i < temperatureIn.length; i++)
             {
                      System.out.println("Day "+ (i+1) +" "+ temperatureIn[i]);
             }
         }
         
         static void wasHot(double[] temperatureIn)
	 {
	     System.out.println(); 
	     System.out.println("*** HOT TEMPERATURES ***");
	     for (int i = 0; i < temperatureIn.length; i++)
             {
                      if (temperatureIn[i] >= 18)
                      {
                          System.out.println("Day "+(i+1)+" "+ temperatureIn[i]);   
                      }         
             }
         }
         
         static void convertToFarenheit(double[] temperatureIn)
	 {
	     for (int i = 0; i < temperatureIn.length; i++)
             {
                 temperatureIn[i]=(temperatureIn[i] * 9 / 5) + 32;
             }
         }
	 
         
}