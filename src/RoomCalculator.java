
/*
 * 
 *  @Author Sam Keim -  GitHub @ Samtheenby
 */

import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		
		// Room Calculator
		// Declare Variables
		Scanner scnr = new Scanner(System.in);
		final double HEIGHT = 10.0;
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println("Would you like to use the calculator? (Y/N)");
		String userChoice = scnr.next();
		
		// Check for breakage
		while (!(userChoice.substring(0,1).equalsIgnoreCase("Y")) && !(userChoice.substring(0,1).equalsIgnoreCase("N"))) {
			System.out.println("Please enter Y or N.");
			userChoice = scnr.next();
		}
		
		// While loop for while answer begins with "Y"
		while (userChoice.substring(0,1).equalsIgnoreCase("Y")) {
			// Get user input
			System.out.println("Enter Length:");
			double length = scnr.nextDouble();
			System.out.println("Enter Width:");
			double width = scnr.nextDouble();
			
			// Calculations
			double area = length * width;
			double perimeter = (length + width) * 2;
			double volume = length * width * HEIGHT;
			
			// Print results
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			
			// Ask to continue
			System.out.println("Would you like to calculate another room? (Y/N)");
			userChoice = scnr.next();
			
			//Check for breakage
			while (!(userChoice.substring(0,1).equalsIgnoreCase("Y")) && !(userChoice.substring(0,1).equalsIgnoreCase("N"))) {
				System.out.println("Please enter Y or N.");
				userChoice = scnr.next();
			}
		}
		
		//Exit protocol
		System.out.println("Thank you, goodbye.");
		scnr.close();
	}
}