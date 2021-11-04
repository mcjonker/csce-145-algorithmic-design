/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PBJSandwich p1 = new PBJSandwich();
		PBJSandwich p2 = new PBJSandwich();
		
		String tsN = "", tsCS = "", tsT = "";
		String pbN = "", pbCS = "", pbIC = "";
		String jN = "", jCS = "", jT = "";
		String bsN = "", bsCS = "", bsT = ""; 
		String btsN = "", btsCS = "", btsT = "";
		String bpbN = "", bpbCS = "", bpbIC = "";
		String bjN = "", bjCS = "", bjT = "";
		String bbsN = "", bbsCS = "", bbsT = ""; 
		String status = "";
		
		int tsC = 0, pbC = 0, jC = 0, bsC = 0;
		int btsC = 0, bpbC = 0, bjC = 0, bbsC = 0;
		
		boolean lpbIC = false;
		boolean lbpbIC = false;
		boolean quit = false;
		
		// Welcome
		System.out.println("Welcome to Peanut Butter and Jelly Sandwich Designer!");
		
		while(!quit) { // Front End Loop
			
			// Top Slice
			System.out.println("Enter the information for the first sandwich:");
			System.out.println("Enter the information for the top slice of bread:");
			System.out.println("Enter the name brand:");
			tsN = input.nextLine();
			
			System.out.println("Enter the calories:");
			tsCS = input.nextLine();
			tsC = Integer.valueOf(tsCS);
			
			System.out.println("Enter the type of bread:");
			tsT = input.nextLine();
			
			p1.setTopSlice(tsN, tsC, tsT);
			
			// Peanut Butter
			System.out.println("Enter the information of the peanut butter:");
			System.out.println("Enter the name brand:");
			pbN = input.nextLine();
			
			System.out.println("Enter the calories:");
			pbCS = input.nextLine();
			pbC = Integer.valueOf(pbCS);
			
			System.out.println("Is the peanut butter crunchy? True or False?");
			pbIC = input.nextLine();
			if(pbIC.equalsIgnoreCase("true")) {
				lpbIC = true;
			}
			else {
				lpbIC = false;
			}
			
			p1.setPeanutButter(pbN, pbC, lpbIC);
			
			// Jelly
			System.out.println("Enter the information of the jelly:");
			System.out.println("Enter the name brand:");
			jN = input.nextLine();
			
			System.out.println("Enter the calories:");
			jCS = input.nextLine();
			jC = Integer.valueOf(jCS);
			
			System.out.println("Enter the type of jelly:");
			jT = input.nextLine();
			
			p1.setJelly(jN, jC, jT);
			
			// Bottom Slice
			System.out.println("Enter the information of the bottom slice:");
			System.out.println("Enter the name brand:");
			bsN = input.nextLine();
			
			System.out.println("Enter the calories:");
			bsCS = input.nextLine();
			bsC = Integer.valueOf(bsCS);
			
			System.out.println("Enter the type of bread:");
			bsT = input.nextLine();
			
			p1.setBottomSlice(bsN, bsC, bsT);
			
			// Second Sandwich
			System.out.println("Enter the information for the second sandwich:");
			System.out.println("Enter the information for the top slice of bread:");
			System.out.println("Enter the name brand:");
			btsN = input.nextLine();
			
			System.out.println("Enter the calories:");
			btsCS = input.nextLine();
			btsC = Integer.valueOf(btsCS);
			
			System.out.println("Enter the type of bread:");
			btsT = input.nextLine();
			
			p2.setTopSlice(btsN, btsC, btsT);
			
			// Peanut Butter
			System.out.println("Enter the information of the peanut butter:");
			System.out.println("Enter the name brand:");
			bpbN = input.nextLine();
			
			System.out.println("Enter the calories:");
			bpbCS = input.nextLine();
			bpbC = Integer.valueOf(bpbCS);
			
			System.out.println("Is the peanut butter crunchy? True or False?");
			bpbIC = input.nextLine();
			if(bpbIC.equalsIgnoreCase("true")) {
				lbpbIC = true;
			}
			else {
				lbpbIC = false;
			}
			
			p2.setPeanutButter(bpbN, bpbC, lbpbIC);
			
			// Jelly
			System.out.println("Enter the information of the jelly:");
			System.out.println("Enter the name brand:");
			bjN = input.nextLine();
			
			System.out.println("Enter the calories:");
			bjCS = input.nextLine();
			bjC = Integer.valueOf(bjCS);
			
			System.out.println("Enter the type of jelly:");
			bjT = input.nextLine();
			
			p2.setJelly(bjN, bjC, bjT);
			
			// Bottom Slice
			System.out.println("Enter the information of the bottom slice:");
			System.out.println("Enter the name brand:");
			bbsN = input.nextLine();
			
			System.out.println("Enter the calories:");
			bbsCS = input.nextLine();
			bbsC = Integer.valueOf(bbsCS);
			
			System.out.println("Enter the type of bread:");
			bbsT = input.nextLine();
			
			p2.setBottomSlice(bbsN, bbsC, bbsT);
			
			// Print output
			System.out.println("Sandwich 1:");
			System.out.println(p1.toString());
			System.out.println("");
			System.out.println("Sandwich 2:");
			System.out.println(p2.toString());
			
			if(p1.equals(p2) == true) {
				System.out.println("\nThe two sandwiches are identical.");
			}
			else {
				System.out.println("\nThe two sandwiches are not identical.");
			}
			System.out.println("\nWould you like to use the designer again? True or false?");
			status = input.nextLine();
			if(status.equalsIgnoreCase("true")) {
				quit = false;
			}
			else if(status.equalsIgnoreCase("false")) {
				quit = true;
			}
		}
		System.out.println("Thanks for using the Sandwich Designer!");
	}
}
