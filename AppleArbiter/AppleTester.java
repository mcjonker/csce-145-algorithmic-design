/*
 * Property of Mitchell Jonker
 */

public class AppleTester { // AppleArbiter

	public static void main(String[] args) {
		Apple apple1 = new Apple(); // Initiates three instances of Apple
		Apple apple2 = new Apple();
		Apple apple3 = new Apple();
		
		System.out.println("Welcome to Apple Arbiter!\n");
		
		System.out.println("Creating a default apple\nPrinting the default apple's value");
		System.out.println(apple1.toString()+"\n"); // Prints the toString's output from Apple.java

		System.out.println("Creating another apple\nSetting the new apple's values to the following valid values:\n\"Granny Smith 0.75 0.99\"");
		apple2.setType("Granny Smith");
		apple2.setWeight(0.75); // Sets the weight of apple2 to 0.75kg.
		apple2.setPrice(0.99); // Sets the cost of apple2 to $0.99
		System.out.println("Printing the new apple's values");
		System.out.println(apple2.toString()+"\n");
		
		System.out.println("Creating another apple\nThen setting its values to the following, invalid values \"iPad 2.5 -200\"");
		apple3.setType("iPad"); // This is not an accepted string, so the default "gala" will override this entry.
		apple3.setWeight(2.5);
		apple3.setPrice(-200.0);
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		System.out.println(apple3.toString()+"\n");
		
		System.out.println("Checking if the first and last apples have the same values.");
		System.out.println(apple1.equals(apple3));
	}
}
