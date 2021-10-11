/*
 * Property of Mitchell Jonker
 */
import java.util.Scanner; 
public class datearbiter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date following the month/day/year format!\nThis program will verify if the date exists.\n");
		
		String date = keyboard.nextLine();
		String errorGeneral = "Invalid Date. ";
		String errorMonth = "Month value is outside of the domain.\nMonth options are 1 through 12.\n";
		String errorYear = "Year value cannot be negative. ";
		String errorThirty = "Day entered for inputted month is too large.\nDay options for this month are 1 through 30.\n";
		String errorThirtyOne = "Day entered for inputted month is too large.\nDay options for inputted month are 1 through 31.\n";
		String errorTwentyNine = "Year entered is not a leap year.\nFebruary 29th only occurs on leap years.\n";
		String errorTwentyEight = "Day entered for February is too large.\nDay options for non-leap year Februarys' are 1 through 28.\n";
		String errorNegative = "Entered values for month, day, and year must be positive.\n";
		String reprompt = "Enter another date in month/day/year format to try again.\n";
		String div = "/";
		
		int pos1 = 2, pos2 = 2, m = 12,  y = 0, yl = 4, d0 = 30, d1 = 31, d2 = 28, d3 = 29, x = 0; //Limits defined for the specific types
		int jan = 1, feb = 2, mar = 3, apr = 4, may = 5, jun = 6, jul = 7, aug = 8, sep = 9, oct = 10, nov = 11, dec = 12;
		
		for(boolean valid = true; x >= 0; date = keyboard.nextLine()) { //This is the beginning of the arbitration loop.
			
			pos1 = date.indexOf(div);
			pos2 = date.indexOf(div, pos1 + 1);
			
			String month = date.substring(0,pos1);
			String day = date.substring(pos1+1,pos2);
			String year = date.substring(pos2+1);
			
			int checkMonth = Integer.valueOf(month), checkYear = Integer.valueOf(year), checkDay = Integer.valueOf(day);
			
				if(checkMonth <= m) { //This first segment insures that the entered value for month is the domain.
					if(checkYear <= y) {
						System.out.println(errorGeneral+errorYear+reprompt);
						valid = false; //If valid is = to false, the date is not valid and the system will output accordingly.
					}
					if(checkDay <= 0) {
						System.out.println(errorGeneral+errorNegative+reprompt);
						valid = false;
					}
					if(checkDay > d1) { //This subsegment considers a date error for the months that have a maximum of 31 days. An error is given when the date is larger than 31.
						if(checkMonth == jan) {
							System.out.println(errorGeneral+errorThirtyOne+reprompt);
							valid = false;
						}
						if(checkMonth == mar) {
							System.out.println(errorGeneral+errorThirtyOne+reprompt);
							valid = false;
						}
						if(checkMonth == may) {
							System.out.println(errorGeneral+errorThirtyOne+reprompt);
							valid = false;
						}
						if(checkMonth == jul) {
							System.out.println(errorGeneral+errorThirtyOne+reprompt);
							valid = false;
						}
						if(checkMonth == aug) {
							System.out.println(errorGeneral+errorThirtyOne+reprompt);
							valid = false;
						}
						if(checkMonth == oct) {
							System.out.println(errorGeneral+errorThirtyOne);
							valid = false;
						}
						if(checkMonth == dec) {
							System.out.println(errorGeneral+errorThirtyOne+reprompt);
							valid = false;
						}
					}
					if(checkDay > d0) { //This subsegment considers a date error for the months that have a maximum of 30 days. 
						if(checkMonth == apr) {
							System.out.println(errorGeneral+errorThirty+reprompt);
							valid = false;
						}
						if(checkMonth == jun) {
							System.out.println(errorGeneral+errorThirty+reprompt);
							valid = false;
						}
						if(checkMonth == sep) {
							System.out.println(errorGeneral+errorThirty+reprompt);
							valid = false;
						}
						if(checkMonth == nov) {
							System.out.println(errorGeneral+errorThirty+reprompt);
							valid = false;
						}
					}
					if(checkMonth == feb) { //This segment determines if the inputted day value for February exists. This is the leap year logic check.
						if(checkDay == d3) {
							if(checkYear % 400 == 0) {
								valid = true;
							}
							else if(checkYear % 100 == 0) {
								System.out.println(errorGeneral+errorTwentyNine+reprompt);
								valid = false;
							}
							else if(checkYear % yl == 0) {
								valid = true;
							}
							else {
								System.out.println(errorGeneral+errorTwentyNine+reprompt);
								valid = false;
							}
						}
						else if(checkDay > d2) {
							System.out.println(errorGeneral+errorTwentyEight+reprompt);
							valid = false;
						}
					}
				}
				if(checkMonth > m) { //If the month is greater than m (m=12), then an error will be output accordingly.
					System.out.println(errorGeneral+errorMonth+reprompt);
					valid = false;
				}
				if(checkMonth <= 0) {
					System.out.println(errorGeneral+errorMonth+reprompt);
					valid = false;
				}
				if(valid == true) { //If the entered date did not trigger any errors, valid will still be true, and the date is therefore valid.
					System.out.println(date+" is a valid date!\n"+reprompt);
				}
				valid = true; //Set valid to true so user can continue to enter dates after entering an invalid date.
		}
	}
}