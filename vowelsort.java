/*
 * Property of Mitchell Jonker 
 */

import java.util.Scanner;
public class vowelsort {

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		char[] typesLow = {'a', 'e', 'i', 'o', 'u'}; //Lowercase vowel array initiated
		char[] typesHigh = {'A', 'E', 'I', 'O', 'U'}; //Uppercase vowel array initiated
		int[] counts = {0, 0, 0, 0, 0}; // Positions in this array: 1-5 are respectively a, e, i, o, u (until sorted)
		
		boolean sort = true; //Sort boolean manages the arrays into least to most utilizing sorting logic.
		
		System.out.println("Welcome to Vowel Sort! Enter a sentence or phrase.\nThe program will determined how many of each vowel you used");
		
		String input = keyboard.nextLine();
		
		for(int l = 0; l < input.length(); l++) { //This bundle of nested statements develops the logic for storing how many times each individual vowel is used.
			if(input.charAt(l) == typesLow[0]) { //typesLow and typesHigh are in place to make sure that the program's counting is case-insensitive
				counts[0]++;
			}
			else if(input.charAt(l) == typesHigh[0]) { 
				counts[0]++;
			}
			else if(input.charAt(l) == typesLow[1]) { 
				counts[1]++;
			}
			else if(input.charAt(l) == typesHigh[1]) {
				counts[1]++;
			}
			else if(input.charAt(l) == typesLow[2]) {
				counts[2]++;
			}
			else if(input.charAt(l) == typesHigh[2]) {
				counts[2]++;
			}
			else if(input.charAt(l) == typesLow[3]) {
				counts[3]++;
			}
			else if(input.charAt(l) == typesHigh[3]) {
				counts[3]++;
			}
			else if(input.charAt(l) == typesLow[4]) {
				counts[4]++;
			}
			else if(input.charAt(l) == typesHigh[4]) {
				counts[4]++;
			}
		}

		while(sort) {
			sort = false;
			for(int b = 1; b < 5; b++) {
				if(counts[b-1] > counts[b]) {
					
					int hold = counts[b-1];
					counts[b-1] = counts[b];
					counts[b] = hold;
					
					char holdTypes = typesHigh[b-1];
					typesHigh[b-1] = typesHigh[b];
					typesHigh[b] = holdTypes;
					
					sort = true;
				}
			}
		}
		
		System.out.println("\nThe vowels and their counts from least to most:\n");

		for(int p = 0; p < 5; p++) {
			//if(p = )
			System.out.println(counts[p]+" "+typesHigh[p]+"'s"); //This forms a logic that lists ties in alphebetical order as well as outputs all vowel counts and types from least used to most used.
		}
	}
}
