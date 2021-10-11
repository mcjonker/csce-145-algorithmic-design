/*
 * Property of Mitchell Jonker 
 */
import java.util.Scanner;
public class triangleprint {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int peak = 0;
		
		System.out.println("Welcome to Triangle Print!\nEnter the desired height of the triangle.\nThe entered value must be a non-zero positive integer.");
		
		Boolean test = keyboard.hasNextInt(); //This hasNextInt() checks if the next entered string from keyboard is an integer or not. If the entered value is not an integer, the program will quit. 
		String input = keyboard.next();
		
		if(test == true) {
			peak = Integer.parseInt(input); //If the entered value is an integer, the string's value is parsed into an integer for further use.
		}
		if(test == false) { //Notifies the user and terminates the software if the entered value is not an integer.
			System.out.println(input+" is not an integer");
			System.exit(0);
		}
		if(peak <= 0) {
			System.out.println("\""+peak+"\" is out of the indicated range.\n"); //Terminates the program and notifies the user if the entered value is negative or = to 0
			System.exit(0);
		}
		for(int t = 0; t <= peak; t++) { //t is times run, s is step prints.
			System.out.println();
			for(int s = 0; s < t; s++) {
			System.out.print("*");
			}
		}
		for(int r = peak-1; r >= 1; r--) { //r is return times and sr is step return prints
			System.out.println();
			for(int sr = 0; sr <= r-1; sr++) {
			System.out.print("*");
			}
		}
		System.out.println("\n\nThere it is!");
	}
}