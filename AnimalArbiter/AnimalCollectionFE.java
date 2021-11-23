/*
 * Property of Mitchell Jonker 
 */

import java.util.Scanner;
public class AnimalCollectionFE {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AnimalCollection aCollection = new AnimalCollection();
		System.out.println("Welcome to Animal Arbiter! Choose from the following options and enter their respective number.");
		
		boolean quit = false, valid = true;
		
		int intake = 0, answer = 0;
		
		while(!quit) { // Operation loop
			while(valid) {
				System.out.println("Type \"add\" to add an animal.");
				System.out.println("Type \"remove\" to remove an animal.");
				System.out.println("Type \"print\" to print the collection.");
				System.out.println("Type \"quit\" to quit the program.\n");
				
				String status = input.nextLine();
				
				
				if(status.equalsIgnoreCase("quit")) { // If user enters quit, the program terminates right away.
					quit = true;
					System.out.println("Thank you for using Animal Arbiter!");
					System.exit(0);
				}
				if(status.equalsIgnoreCase("add")) {
					System.out.println("Enter the following information to add the animal:");
					System.out.println("What type of animal do you want to add to the collection?");
					System.out.println("Your options are: (1) Dog, (2) Cat");
					System.out.println("Enter the corresponding number to your decision.");
					
					String numberS = input.nextLine(); // This is a workaround to let integers and strings from scanner both work without a nextLine bug.
					intake = Integer.parseInt(numberS);
					
					if(intake == 1) { // Dog
						System.out.println("Are you wanting to add a (1) Domestic Dog, or a (2) Wolf?");
						System.out.println("Enter the corresponding number to your decision.");
						
						String inputS = input.nextLine();
						answer = Integer.valueOf(inputS);
						
						if(answer == 1) { // Domestic Dog
							System.out.println("Enter the Name");
							String name = input.nextLine();
							
							System.out.println("Enter the Weight");
							String weightS = input.nextLine();
							double weight = Integer.valueOf(weightS);
							
							System.out.println("Enter the Energy Level");
							String engS = input.nextLine();
							int energy = Integer.valueOf(engS);
							
							System.out.println("Enter the Type of Domestic Dog");
							String type = input.nextLine();
							
							DomesticDog dDog = new DomesticDog(name, weight, energy, type);
							aCollection.addAnimal(dDog);
						}
						if(answer == 2) { // Wolf
							System.out.println("Enter the Name");
							String name = input.nextLine();
							
							System.out.println("Enter the Weight");
							String weightS = input.nextLine();
							double weight = Integer.valueOf(weightS);
							
							System.out.println("Enter the Energy Level");
							String engS = input.nextLine();
							int energy = Integer.valueOf(engS);
							
							System.out.println("Enter the Pack Leader");
							String leader = input.nextLine();
							
							Wolf wolf = new Wolf(name, weight, energy, leader);
							aCollection.addAnimal(wolf);
						}
						else {
							System.out.println("Please enter a valid value.");
							valid = false;
						}
					}
					else if(intake == 2) { // Cat
						System.out.println("Are you wanting to add a (1) House Cat, or a (2) Leopard?");
						System.out.println("Enter the corresponding number to your decision.");
						
						String inputS = input.nextLine();
						answer = Integer.valueOf(inputS);
						
						if(answer == 1) { // House Cat
							System.out.println("Enter the Name");
							String name = input.nextLine();
							
							System.out.println("Enter the Weight");
							String weightS = input.nextLine();
							double weight = Integer.valueOf(weightS);
							
							System.out.println("Enter the Mood");
							String mood = input.nextLine();
							
							System.out.println("Enter the Type of House Cat");
							String type = input.nextLine();
							
							HouseCat hCat = new HouseCat(name, weight, mood, type);
							aCollection.addAnimal(hCat);
						}
						if(answer == 2) { // Leopard
							System.out.println("Enter the Name");
							String name = input.nextLine();
							
							System.out.println("Enter the Weight");
							String weightS = input.nextLine();
							double weight = Integer.valueOf(weightS);
							
							System.out.println("Enter the Mood");
							String mood = input.nextLine();
							
							System.out.println("Enter the number of Spots");
							String spotsS = input.nextLine();
							int spots = Integer.valueOf(spotsS);
							
							Leopard leopard = new Leopard(name, weight, mood, spots);
							aCollection.addAnimal(leopard);
						}
						else {
							System.out.println("Please enter a valid value.");
							valid = false;
						}
					}
					else {
						System.out.println("Please enter a valid value.");
						valid = false;
					}
					
				}
				valid = true; // Allows the loop to reset when the outer loop cycles.
				
				if(status.equalsIgnoreCase("print")) {
					System.out.println();
					aCollection.printAnimals(); // Print loop is within the method.
					System.out.println();
				}
				
				if(status.equalsIgnoreCase("remove")) {
					System.out.println("Enter the name of the animal to remove it:");
					String name = input.nextLine();
					aCollection.removeAnimal(name);
				}
			}
		}
	}
}
