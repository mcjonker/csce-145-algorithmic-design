/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dresser dresser = new Dresser();
		
		boolean quit = false;
		
		System.out.println("Welcome to Clothing Arbiter!");
		
		while(!quit) {
			System.out.println("\nWhat would you like to do with your dresser?");
			System.out.println("Type \"add\" to add clothes.");
			System.out.println("Type \"remove\" to remove clothes.");
			System.out.println("Type \"quit\" to quit the program.\n");
			
			String status = input.nextLine();
			
			if(status.equalsIgnoreCase("quit")) { // If user enters quit, the program terminates right away.
				quit = true;
				System.out.println("Thank you for using Clothing Arbiter!");
				System.exit(0);
			}
			if(status.equalsIgnoreCase("add")) {
				System.out.println("Enter the following information to add the article of clothing:");
				System.out.println("Enter the type of clothing:");
				String type = input.nextLine();
				System.out.println("Enter the color of clothing:");
				String color = input.nextLine();
				Clothing c1 = new Clothing(type, color);
				dresser.add(c1);
			}
			if(status.equalsIgnoreCase("remove")) {
				System.out.println("Enter the following information to remove the article of clothing:");
				System.out.println("Enter the type of clothing:");
				String type = input.nextLine();
				System.out.println("Enter the color of clothing:");
				String color = input.nextLine();
				Clothing c2 = new Clothing(type, color);
				dresser.remove(c2);	
			}
			dresser.print(); // After every operation, print items in the dresser
		}
	}
}
