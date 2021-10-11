/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class circlesort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int initInt = 0; //Initially defined items for further use
		int compute = 0;
		
		boolean enabled = false;
		boolean confirmed = false;
		boolean cycle = false;
		boolean sort = true; //Sort boolean manages the arrays into least to most utilizing sorting logic.
		
		System.out.println("Welcome to Circle Sort!\nThis program will sort circles for you by their area.");
		
		while(enabled == false) {
			System.out.println("Please select from the following options:\n1) Enter Circle Data\n2) Quit the program.\n\nEnter the number of the option you wish to choose.");
			
			Boolean testinit = keyboard.hasNextInt();
			String init = keyboard.nextLine();
			
			if(testinit == true) {
				initInt = Integer.parseInt(init);
				if(initInt == 1) { 
					enabled = true;
				}
				else if(initInt == 2) { 
					System.out.println("System Closed");
					System.exit(0);
				}
				else { //When 1 or 2 are not entered.
					System.out.println("Invalid option. Please choose between the defined options.\n");
				}
			}
			if(testinit == false) {
				System.out.println("Invalid option. Please choose between the defined options.\n");
			}			
		}
		
		while(enabled == true) {
		System.out.println("How many circles are you wanting to sort?");
		
		boolean sizeCheck = false;
		confirmed = false;
		int arraySize = 0;
		
		while(sizeCheck == false) {
			Boolean arrayAccept = keyboard.hasNextInt();
			String arraySizeStr = keyboard.nextLine();
			
			if(arrayAccept == true) {
				arraySize = Integer.parseInt(arraySizeStr); //Array Size is valid.
				if(arraySize > 0) {
					confirmed = true;
					sizeCheck = true;
				}
				if(arraySize <= 0) {
					System.out.println("Entered value is not valid.\nPlease enter a non-zero, positive integer for the number of circles.");
					//Input is an Integer; however it is out of bounds
				}
			}
			if(arrayAccept == false) {
				System.out.println("Entered value is not valid.\nPlease enter a non-zero, positive integer for the number of circles.");
				//Input is not an integer.
			}
		}
		while(confirmed) {
			confirmed = false;
			double[] circle = new double[arraySize];
			int[] order = new int[arraySize];
			//Enter radii of the circles into the array
			for(int c = 0; c < arraySize; c++) { //loops through, storing the radius(converted to area) of each circle.
				
				double radii = 0.0;
				
				System.out.println("\nEnter the radius of circle "+(c+1)+":");
				
				Boolean radiiTest = keyboard.hasNextDouble();
				String radiiStr = keyboard.nextLine();
			
				if(radiiTest == true) {
					radii = Double.parseDouble(radiiStr); //Parses the string into a double iff the entered string value is also a valid double value.
					double area = radii*radii*3.14159;
					//System.out.println(area+"is the area"); //This can be enabled to show the area, for dev purposes.
					circle[c] = area;
					order[c] = c;
				}
				if(radiiTest == false) {
					System.out.println("Entered value is not a valid value.\nPlease enter a number.");
					c--; //subtracts one from c so that the loop will continue to loop until 10 valid entries have been issued, rather than 10 total entries.
				}
			}
			
			cycle = true;
			
			while(cycle) {
				System.out.println("\n- - - - - - - - - - -\nSelect from the following options.\n1) Sort and output the circles' areas from smallest to largest.\n2) Sort and output the circles' from largest to smallest.\n3) Quit the program\n\nEnter the number of the option you wish to choose.");
				Boolean checkOption = keyboard.hasNextInt();
				String inputOption = keyboard.nextLine();
				
				if(checkOption == true) {
					compute = Integer.parseInt(inputOption); //An empty collection cannot make it this far into the code so it is unnecessary to include logic that would prevent the user from attempting to sort an empty collection.
						if(compute == 1) {
							//Smallest to Largest Sort
							while(sort) {
								sort = false;
								for(int b = 1; b < arraySize; b++) {
									if(circle[b-1] > circle[b]) {
										
										double hold = circle[b-1];
										circle[b-1] = circle[b];
										circle[b] = hold;
										
										int holdOrder = order[b-1];
										order[b-1] = order[b];
										order[b] = holdOrder;
										
										sort = true;
									}
								}
							}
							System.out.println("\nSorted from Smallest to Largest:");
							for(int p = 0; p < arraySize; p++) {
								System.out.println("Circle "+(order[p]+1)+": "+circle[p]);
							}
						}
						else if(compute == 2) {
							//Largest to Smallest Sort
							while(sort) {
								sort = false;
								for(int b = 1; b < arraySize; b++) {
									if(circle[b-1] > circle[b]) {
										
										double hold = circle[b-1];
										circle[b-1] = circle[b];
										circle[b] = hold;
										
										int holdOrder = order[b-1];
										order[b-1] = order[b];
										order[b] = holdOrder;
										
										sort = true;
									}
								}
							}
							System.out.println("\nSorted from Largest to Smallest:"); //This method is used (returning the sorted array) in reverse order rather than reversing the order of the array to simplify the process and smoothen the workflow.
							for(int p = arraySize-1; p > -1; p--) {
								System.out.println("Circle "+(order[p]+1)+": "+circle[p]);
							}
						}
						else if(compute == 3) {
							System.out.println("System Closed");
							System.exit(0);
						}
						else {
							System.out.println("Is not a valid input. Please choose between the defined options.");
						}
				}
				if(checkOption == false) {
					System.out.println("Is not a valid input. Please choose between the defined options.");
				}
			}
		}
		enabled = false;
		}
	}
}
