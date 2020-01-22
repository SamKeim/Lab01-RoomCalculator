
/*
 * 
 * @Author Sam Keim -  GitHub @ Samtheenby
 */

import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		
		// Room Calculator
		Scanner scnr = new Scanner(System.in);
		final double HEIGHT = 10.0;
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println("Would you like to use the calculator? (Y/N)");
		String userChoice = scnr.nextLine();
		
		while (!(userChoice.substring(0,1).equalsIgnoreCase("Y")) && !(userChoice.substring(0,1).equalsIgnoreCase("N"))) {
			System.out.println("Please enter Y or N.");
			userChoice = scnr.nextLine();
		}
		while (userChoice.substring(0,1).equalsIgnoreCase("Y")) {
			System.out.println("Enter Length:");
			double length = scnr.nextDouble();
			
			System.out.println("Enter Width:");
			double width = scnr.nextDouble();
			
			double area = length * width;
			double perimeter = (length + width) * 2;
			double volume = length * width * HEIGHT;
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			
			System.out.println("Would you like to calculate another room? (Y/N)");
			userChoice = scnr.nextLine();
			
			while (!(userChoice.equalsIgnoreCase("Y")) && !(userChoice.equalsIgnoreCase("N"))) {
			System.out.println("Please enter Y or N.");
			userChoice = scnr.nextLine();
			
			}
		}
		System.out.println("Thank you, goodbye.");
		scnr.close();
	}
}