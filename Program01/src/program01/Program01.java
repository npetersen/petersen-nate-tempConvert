/*
 
 */

package program01;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double tempF, tempC;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program converts a temperature in Celcius to a temperature in Fahrenheit.");
        
        System.out.println("\nPlease enter the temperature in celcius: ");
        
        tempC = keyboard.nextDouble();
        
        tempF = (9.0/5.0) * tempC + 32.0;
        
        System.out.println(tempC + " Celcius is equal to " + tempF + " Fahrenheit.");
        
    }
    
}
