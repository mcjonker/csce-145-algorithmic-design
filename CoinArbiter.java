/*
 * Property of Mitchell Jonker
 */
import java.util.Scanner;//Imports Scanner so we can utilize its function.
public class CoinArbiter {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //Java kept yelling at me for a resource leak.. so I added this suppression.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nProvide a integer from 0 to 99 cents.\nYou will recieve the solution in cents in the fewest number of coins possible.\n");
		int leftover = 0;
		for(int cents = keyboard.nextInt(); leftover < 1; cents = keyboard.nextInt()) { //The logical engine of this program begins here, creating a repeating function. This allows the user to use the program repeatedly without needing to restart the program every time.
			while(leftover < 1) { //leftover is set to 0 every time else if ends, so including conditions here simply make the program work.
				if(cents < 0) { //This is the first level of passage. If the entered value of cents is not a positive integer, it will return the below text and request a new value.
					System.out.println("Value entered is outside of indicated range.\nPlease provide a positive integral value no larger than 99 cents.\n"); //This text will return to the console if the value entered is not within the domain [0,99] (that is inclusive).
				}
				else if(cents <= 99) { //
					System.out.println("Calculating...");
					System.out.println(cents+" cents in coins:");
						int quarters = cents / 25;
						leftover = cents % 25;
						int dimes = leftover / 10;
						leftover = leftover % 10;
						int nickles = leftover / 5;
						leftover = leftover % 5;
						int pennies = leftover / 1;
						leftover = 0;
						System.out.println(quarters+" quarters\n"+dimes+" dimes\n"+nickles+" nickles\n"+pennies+" pennies\n"); //This is the final output to the user before cycling back for the user to input another value.
				}
				if(cents > 99) { //This final status insures that any value that passes the initial if and else if statements (which would be any value that is greater than 99) prompts the machine to return an invalid value message.
					System.out.println("Value entered is outside of indicated range.\nPlease provide a positive integral value no larger than 99 cents.\n");
				}
				break;
			}
		}
	}
}