/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class CoffeeTester { // CoffeeArbiter

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in); // coffee1 Scanner
		Scanner input2 = new Scanner(System.in); // coffee2 Scanner
		Scanner input3 = new Scanner(System.in); // Primary user input Scanner
		Coffee coffee1 = new Coffee(); // First Coffee
		Coffee coffee2 = new Coffee(); // Second Coffee
		
		String status = "";
		
		boolean run = true;
		
		for(int l = 1; run = true; l++) { // Run loop allows the restart function to work, using the run boolean.
			run = false;
		
			System.out.println("Welcome to Coffee Arbiter!");
			
			System.out.println("Enter the name of the first coffee:");
			coffee1.setName(input1.next());
			
			System.out.println("Enter the caffeine content (in mg) of the first coffee:");
			coffee1.setCaffeine(input1.nextDouble());
			
			System.out.println("Enter the name of the second coffee:");
			coffee2.setName(input2.next());
			
			System.out.println("Enter the caffeine content (in mg) of the second coffee:");
			coffee2.setCaffeine(input2.nextDouble());
			
			System.out.println(coffee1.toString());
			System.out.println(coffee2.toString());
			System.out.println();
			
			System.out.println("Within an hour, it would be risky to drink: "+coffee1.riskyAmount()+" cups of "+coffee1.getName());
			System.out.println("Within an hour, it would be risky to drink: "+coffee2.riskyAmount()+" cups of "+coffee2.getName());
			System.out.println();
			
			if(coffee1.equals(coffee2)) { // equals method of coffee1 has a parameter, which is filled with coffee2 to combare them together.
				System.out.println(coffee1.getName()+" is the same as "+coffee2.getName()); // Prints if the coffees are the same.
			}
			else {
				System.out.println(coffee1.getName()+" is a different coffee than "+coffee2.getName());
			}
			System.out.println("\nThanks for using Coffee Arbiter! Type \"restart\" to restart the program or type anything else to quit.");
			status = input3.nextLine();
			
			if(status.equalsIgnoreCase("restart")) { // If the user does not type restart, the program terminates upon any other entry.
				run = true;
			}
			else {
				System.exit(0);
			}
		}
	}
}
