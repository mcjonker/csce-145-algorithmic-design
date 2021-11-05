/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Box Sort!");
		boolean quit = false;
		boolean running = true;
		while(!quit) {
			while(running) {
				boolean valid = false;
				System.out.print("\nEnter the number of boxes to be sorted or type 0 to quit.\n");
				String inputS = scanner.nextLine();
				int input = Integer.valueOf(inputS);
				
				if(input == 0) { // If user enters 0, terminate the program.
					System.out.println("\nThank you for using Box Sort!");
					System.exit(0); 
				}
				if(input > 0) {
					valid = true;
				}
				if(input < 0) {
					System.out.println("\nA negative number of boxes is not possible. Try again.");
					running = false;
					break;
				}
				while(valid) {
					Box[] storage = new Box[input];
					for(int i = 0; i < input; i++) {
						int num = i+1;
						
						storage[i] = new Box(); // To avoid null, assign default box before calling methods.
						
						System.out.println("\nEnter the label name for box "+num);
						String label = scanner.nextLine();
						storage[i].setLabel(label);
						
						System.out.println("\nEnter the length (feet) of box "+num);
						String lengthS = scanner.nextLine();
						Double length = Double.valueOf(lengthS);
						storage[i].setLength(length);
						
						System.out.println("\nEnter the width (feet) of box "+num);
						String widthS = scanner.nextLine();
						Double width = Double.valueOf(widthS);
						storage[i].setWidth(width);
						
						System.out.println("\nEnter the height (feet) of box "+num);
						String heightS = scanner.nextLine();
						Double height = Double.valueOf(heightS);
						storage[i].setHeight(height);
						
					}
					boolean sort = true;
					while(sort) {
						sort = false;
						for(int b = 1; b < input; b++) {
							if(storage[b-1].getVolume() > storage[b].getVolume()) { // Sort from smallest to largest in terms of volume.
								
								Box hold = storage[b-1];
								storage[b-1] = storage[b];
								storage[b] = hold;

								sort = true;
							}
						}
					}
					for(int i = 0; i < input; i++) {	
						if(i == 0 ) {
							System.out.println("\nSorted boxes (by Volume): ");
						}
						System.out.println(storage[i].toString()); // Print array from first to last (which is sorted).
					}
					System.out.println();
					valid = false;
				}
				System.out.println("\nType anything to quit or restart to restart.");
				String response = scanner.nextLine();
				if(!response.equalsIgnoreCase("restart")) {
					System.out.println("\nThank you for using Box Sort!");
					System.exit(0);
				}
			}
			running = true;
		}	
	}
}
