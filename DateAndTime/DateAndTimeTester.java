/*
 * Property of Mitchell Jonker
 */
import java.util.Scanner;
public class DateAndTimeTester {
	Scanner input = new Scanner(System.in);
	
	private String date = "";
	private String mDiv = "/", dDiv = ":", sDiv = " ";
	private String month = "", day = "", hour = "", minute = "";
	private String answer = "";
	
	private int monthMax = 12, d0 = 30, d1 = 31, d2 = 28;
	private int hourMax = 12, minuteMax = 59, minuteMin = 0, hourMin = 1;
	private int jan = 1, feb = 2, mar = 3, apr = 4, may = 5, jun = 6, jul = 7, aug = 8, sep = 9, oct = 10, nov = 11, dec = 12;
	private int pos1 = 2, pos2 = 2, pos3 = 2;
	private int checkMonth = 0, checkDay = 0, checkHour = 0, checkMinute = 0;
	
	public void run() {
		System.out.println("Welcome to the Day and Time Tester! Enter a date and time (MM/DD hh:mm) and the validity of that date will be determined.");
		date = input.nextLine();
		this.getMonth();
		this.getDay();
		this.getHour();
		this.getMinute();
		// this.isValid(); // is called in the following logic.
		if(isValid()) {
			System.out.println("The entered date and time is valid.\n");
		}
		if(!isValid()) {
			System.out.println("The entered date and time is not valid.\n");
		}
		System.out.println("Would you like to continue using the Date and Time Tester?\nType \"yes\" to continue or type anything else to exit.");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			run();
		}
		else {
			System.exit(0);
		}
	}
	public boolean isValid() { // If both are valid, date and time is valid, if one or the other is not valid, the entered combination is invaild. 
		if(isValidDate() && isValidTime()) {
			return true;
		}
		if(!isValidDate() || !isValidTime()) {
			return false;
		}
		else {
			return false;
		}
	}
	public boolean isValidDate() { // MM/DD
		if(checkMonth <= monthMax) { // If month is valid, check day.
			if(checkDay < 0) {
				return false;
			}
			if(checkDay > d0) { // Check days for all months where days cannot be greater than 30.
				if(checkMonth == apr) {
					return false;
				}
				if(checkMonth == jun) {
					return false;
				}
				if(checkMonth == sep) {
					return false;
				}
				if(checkMonth == nov) {
					return false;
				}
			}
			if(checkDay > d1) {
				if(checkMonth == jan) {
					return false;
				}
				if(checkMonth == mar) {
					return false;
				}
				if(checkMonth == may) {
					return false;
				}
				if(checkMonth == jul) {
					return false;
				}
				if(checkMonth == aug) {
					return false;
				}
				if(checkMonth == oct) {
					return false;
				}
				if(checkMonth == dec) {
					return false;
				}
			}
			if(checkDay > d2) {
				if(checkMonth == feb) {
					return false;
				}
			}
			else { // If this point is reached, the month and date are valid.
				return true;
			}
		}
		if(checkMonth > monthMax) { // Month was too high for further check
			return false;
		}
		if(checkMonth <= 0 ) { // Month must be integer value between 1-12 (inclusive)
			return false;
		}
		else {
			return true; // If none of the other statements triggered a false outcome, month is valid.
		}
	}
	public boolean isValidTime() { // hh:mm
		if(checkHour > hourMax) {
			return false;
		}
		if(checkHour < hourMin) { // Hours are between 1 and 12 in the 12 hour system.
			return false;
		}
		if(checkMinute > minuteMax) {
			return false;
		}
		if(checkMinute < minuteMin) {
			return false;
		}
		else {
			return true;
		}
	}
	public int getMonth() { // MM/DD
		pos1 = date.indexOf(mDiv); // pos1 is the position of the "/"
		pos2 = date.indexOf(dDiv); // pos2 is the position of the ":"
		pos3 = date.indexOf(sDiv); // pos3 is the position of the " "
		month = date.substring(0,pos1);
		checkMonth = Integer.valueOf(month);
		return checkMonth;
	}
	public int getDay() { // MM/DD
		day = date.substring(pos1+1,pos3);
		checkDay = Integer.valueOf(day);
		return checkDay;
	}
	public int getHour() { // hh:mm
		hour = date.substring(pos3+1,pos2);
		checkHour = Integer.valueOf(hour);
		return checkHour;
	}
	public int getMinute() { // hh:mm
		minute = date.substring(pos2+1);
		checkMinute = Integer.valueOf(minute);
		return checkMinute;
	}
}