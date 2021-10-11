/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class belowaverage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("In separate entries, provide the temperatures of each day on a 10-day interval.\nThe software will notify you which days were below the 10-day average.\n");
		
		double[] temperature = new double[10]; //Forms array of temperature inputs
		double foravg = 0; //This is a temporary value that is stored to develop the average temperature. It serves as the sum total of all entered temperatures.
		double avg = 0;
		
		for(int t=0; t<10; t++) { //This for loop cycles through the array storing doubles in the array's set locations 0 to 9 (inclusive)
			System.out.println("Enter the value for: Day "+(t+1));
			temperature[t] = keyboard.nextDouble();
			foravg = foravg+temperature[t];
		}
		
		avg = foravg / 10; //This stores the average value as the sum total of all temperature values, divided by the quantity of inputs (10).
		System.out.println("\nThe average temperature was: "+avg+"\n\nThe days that were below average were:"); 
		for(int c=0; c<10; c++) {
			if(temperature[c] < avg) { //This prints out the day and corresponding temperature iff that given day's temperature was less than the average temperature.
				System.out.println("Day "+(c+1)+" at "+temperature[c]); 
			}
		}	
	}
}
