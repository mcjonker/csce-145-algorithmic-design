/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random aiChoice = new Random(); //This random number generator will pick a random value between 0-2 (inclusive) to be converted into "rock" "paper" or scissors.Random is unique in the sense that it has a chance of choosing the same value more than one time in a row, as one may do in Rock Paper Scissors against another human.
		
		int userScore = 0, aiScore = 0, roundCount = 0; 
		int rock = 0, paper = 1, scissors = 2; //For future recall and ease of reference, the values for rock, paper, and scissors are assigned to numbers, that coinsides with the random values that the computer can choose from.
		int userEntryInt = 0, aiEntryInt = 0;
		
		boolean play = false; //This boolean determines the status of the game if is in play mode or standby. Its state is used to determine the program's behavior.
		
		String status = "";
		String userEntry = "";
		String winner = "";
		
		while(play == false) {
			System.out.println("Welcome to the Rock Paper Scissors game! Type \"Play\" to start!\n");
			status = keyboard.nextLine();
			if(status.equalsIgnoreCase("play")) {
				play = true;
				System.out.println("\nLet the game begin!");
			}
			while(play == true) { //This while loop is enabled when the user has confirmed that they want to play and contains the primary game logic.
				System.out.println("Type \"rock\" \"paper\" or \"scissors\" and then the Computer will choose their item.\n");
				
				aiEntryInt = aiChoice.nextInt(3);
				
				userEntry = keyboard.nextLine();
				System.out.print("\n");
				
				if(userEntry.equalsIgnoreCase("rock")) { //This if statement (with several nested statements) is contains the process for a given entered string by the user for each round. Each group addresses a different entry.
					userEntryInt = rock;
					if(aiEntryInt == paper) {
						System.out.println("You lost this round!\nThe Computer beat you with paper!");
						aiScore = aiScore + 1;
					}
					if(aiEntryInt == scissors) {
						System.out.println("You won this round!\nThe Computer lost by selecting scissors!");
						userScore = userScore + 1;
					}
					if(aiEntryInt == rock) {
						System.out.println("You and the Computer tied.\nNo points were gained or lost in this round.");
					}
					roundCount = roundCount + 1;
				}
				else if(userEntry.equalsIgnoreCase("paper")) {
					userEntryInt = paper;
					if(aiEntryInt == scissors) {
						System.out.println("You lost this round!\nThe Computer beat you with scissors!");
						aiScore = aiScore + 1;
					}
					if(aiEntryInt == rock) {
						System.out.println("You won this round!\nThe Computer lost by selecting rock!");
						userScore = userScore + 1;
					}
					if(aiEntryInt == paper) {
						System.out.println("You and the Computer tied.\nNo points were gained or lost in this round.");
					}
					roundCount = roundCount + 1;
				}
				else if(userEntry.equalsIgnoreCase("scissors")) {
					userEntryInt = scissors;
					if(aiEntryInt == rock) {
						System.out.println("You lost this round!\nThe Computer beat you with rock!");
						aiScore = aiScore + 1;
					}
					if(aiEntryInt == paper) {
						System.out.println("You won this round!\nThe Computer lost by selecting paper!");
						userScore = userScore + 1;
					}
					if(aiEntryInt == scissors) {
						System.out.println("You and the Computer tied.\nNo points were gained or lost in this round.");
					}
					roundCount = roundCount + 1;
				}
				else if(userEntry != "") { //If the user enters an invalid value, the user forefits the round and surrenders the possible point to the computer.
					System.out.println("\""+userEntry+"\" is not a valid item.\nPoint awarded to the Computer.");
					aiScore = aiScore + 1;
					roundCount = roundCount + 1;
				}
				
				//Reset necessary integers and strings
				userEntryInt = 0; 
				aiEntryInt = 0;
				userEntry = "";
				
				if(roundCount == 3) {
					System.out.println("\n\nGame over!\n\nScoreboard:\n\nYou: "+userScore+"\nComputer: "+aiScore+"\n\nRounds: "+roundCount);
					
					//Post game report
					if(userScore > aiScore) {
						winner = "You!";
						System.out.println("\nThe winner is: "+winner);
					}
					else if(userScore < aiScore) {
						winner = "Computer";
						System.out.println("\nThe winner is: "+winner);
					}
					else if(userScore == aiScore) {
						System.out.println("\nThe game was a tie!");
					}
					System.out.println("\nWould you like to play again? Type \"yes\" to play or type anything else and hit enter to quit the game.");
					status = keyboard.nextLine();
					if(status.equalsIgnoreCase("yes")) {
						System.out.println();
						play = true;
						roundCount = 0;
						userEntryInt = 0;
						aiEntryInt = 0;
						userScore = 0;
						aiScore = 0;
						userEntry = "";
						winner = "";
						userEntry = "";
						status = "";	
					}
					else {
						play = false;
						System.out.println("Goodbye then!\n");
						System.exit(0);
					}
				}
				//Reset user input values so that the next game is not influenced by the previous.
				userEntryInt = 0;
				userEntry = "";
			}		
		}
	}
}