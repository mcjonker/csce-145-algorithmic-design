/*
 * Property of Mitchell Jonker 
 */

import java.util.Scanner;
import java.util.Random;
public class RandomDice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random oneinsix = new Random();
		System.out.println("Welcome to Random Dice!\nEnter how many times you want to roll the 6-sided dice.\nThe program will give the outcome of each roll!\nYour entered value must be a non-zero, positive integer.\n");
		
		int testInt = 0; // testInt will be the integer used for # of rolls if the inputted value is an integer.
		int result = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		
		Boolean test = keyboard.hasNextInt();
		String rolls = keyboard.nextLine();
		System.out.println(""); //Spacing for improved user experience.
		
		if(test == true) {
			// Sets testInt to the entered value if the value is an integer. Note that if you enter very large integer values, the system will crash regardless.
			testInt = Integer.parseInt(rolls);
		}
		if(test == false) {
			System.out.println("\""+rolls+"\" is not an integer.\n\n*Program Closed*\n"); //Terminates the program if the entered value is not an integer.
			System.exit(0);
		}
		if(testInt <= 0) {
			System.out.println("\""+testInt+"\" is out of the indicated range.\n\n*Program Closed*\n"); //Terminates the program if the entered value is negative or = to 0
			System.exit(0);
		}
		// Beginning of the random roll loop
		for(int r = 1; r <= testInt; r++) {
			result = oneinsix.nextInt(6); //Notice that the upper limit is 6. This give the values 0 thru 5 as random outputs.
			System.out.println(result+1+" was rolled"); //Adding one to result removes 0 and adds 6 to the rolling results pool.
			if(result == 0) {
				one++; 
			}
			if(result == 1) {
				two++;
			}
			if(result == 2) {
				three++;
			}
			if(result == 3) {
				four++;
			}
			if(result == 4) {
				five++;
			}
			if(result == 5) {
				six++; //Increases the counter for # of times n was rolled for every time (n-1) is rolled.
			}
		}
		System.out.println("\nOne: "+one+"\nTwo: "+two+"\nThree: "+three+"\nFour: "+four+"\nFive: "+five+"\nSix: "+six+"\n"); //Print results of counters, after for loop has finished rolling.
	}
}
