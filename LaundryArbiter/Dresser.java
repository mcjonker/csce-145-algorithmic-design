/*
 * Property of Mitchell Jonker
 */

public class Dresser {
	private Clothing[][] Clothes;
	
	public Dresser() {
		this.Clothes = new Clothing[5][10];
	}
	public void add(Clothing aC) { // Adds an article of clothing to the drawers array - accepts an article to store, determines where to put it.
		if(aC != null) {
			if(aC.getType() == "Undergarment") {
				int d = 0;
				for(int j = 0; j < 10; j++) { // d(rawer) #0 is for undergarments, so check all 10 slots in this top drawer for an open slot to store. store in first open slot.
					if(Clothes[d][j] == null) {
						Clothes[d][j] = aC;
						System.out.println("Your "+aC.getType()+" was succesfully stored!");
						break;
					}
					else if(j == 9) { // If the final cycle of the for loop does not find a null position in the array to store the object, notify the user that the drawer is full.
						System.out.println("The drawer is full!");
						break;
					}
				}
			}
			if(aC.getType() == "Socks") { // Repeat add method, for the other types.
				int d = 1;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] == null) {
						Clothes[d][j] = aC;
						System.out.println("Your "+aC.getType()+" were succesfully stored!");
						break;
					}
					else if(j == 9) {
						System.out.println("The drawer is full!");
						break;
					}
				}
			}
			if(aC.getType() == "Stockings") {
				int d = 1;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] == null) {
						Clothes[d][j] = aC;
						System.out.println("Your "+aC.getType()+" were succesfully stored!");
						break;
					}
					else if(j == 9) {
						System.out.println("The drawer is full!");
						break;
					}
				}
			}
			if(aC.getType() == "Top") {
				int d = 2;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] == null) {
						Clothes[d][j] = aC;
						System.out.println("Your "+aC.getType()+" was succesfully stored!");
						break;
					}
					else if(j == 9) {
						System.out.println("The drawer is full!");
						break;
					}
				}
			}
			if(aC.getType() == "Bottom") {
				int d = 3;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] == null) {
						Clothes[d][j] = aC;
						System.out.println("Your "+aC.getType()+" was succesfully stored!");
						break;
					}
					else if(j == 9) {
						System.out.println("The drawer is full!");
						break;
					}
				}
			}
			if(aC.getType() == "Cape") {
				int d = 4;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] == null) {
						Clothes[d][j] = aC;
						System.out.println("Your "+aC.getType()+" was succesfully stored!");
						break;
					}
					else if(j == 9) { 
						System.out.println("The drawer is full!"); 
						break;
					}
				}
			}
		}
		else {
			System.err.println("The operation could not be completed, as Clothing[i][j] was null.");
		}
	}
	public void remove(Clothing aC) {
		if(aC != null) {
			if(aC.getType() == "Undergarment") {
				int d = 0;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] != null && aC != null && Clothes[d][j].equals(aC)) {
						Clothes[d][j] = null;
						System.out.println("Your "+aC.getType()+" was succesfully removed!");
						break;	
					}
					else if(j == 9) { // If the final cycle of the for loop does not find a matching object in any of the positions, notify the user that the article could not be found.
						System.out.println("The item could not be found!");
						break;
					}
				}
			}
			if(aC.getType() == "Socks") {
				int d = 1;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] != null && aC != null && Clothes[d][j].equals(aC)) {
						Clothes[d][j] = null;
						System.out.println("Your "+aC.getType()+" were succesfully removed!");
						break;
					}
					else if(j == 9) {
						System.out.println("The item could not be found!");
						break;
					}
				}
			}
			if(aC.getType() == "Stockings") {
				int d = 1;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] != null && aC != null && Clothes[d][j].equals(aC)) {
						Clothes[d][j] = null;
						System.out.println("Your "+aC.getType()+" were succesfully removed!");
						break;
					}
					else if(j == 9) {
						System.out.println("The item could not be found!");
						break;
					}
				}
			}
			if(aC.getType() == "Top") {
				int d = 2;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] != null && aC != null && Clothes[d][j].equals(aC)) {
						Clothes[d][j] = null;
						System.out.println("Your "+aC.getType()+" was succesfully removed!");
						break;
					}
					else if(j == 9) {
						System.out.println("The item could not be found!");
						break;
					}
				}
			}
			if(aC.getType() == "Bottom") {
				int d = 3;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] != null && aC != null && Clothes[d][j].equals(aC)) {
						Clothes[d][j] = null;
						System.out.println("Your "+aC.getType()+" was succesfully removed!");
						break;
					}
					else if(j == 9) {
						System.out.println("The item could not be found!");
						break;
					}
				}
			}
			if(aC.getType() == "Cape") {
				int d = 4;
				for(int j = 0; j < 10; j++) {
					if(Clothes[d][j] != null && aC != null && Clothes[d][j].equals(aC)) {
						Clothes[d][j] = null;
						System.out.println("Your "+aC.getType()+" was succesfully removed!");
						break;
					}
					else if(j == 9) {
						System.out.println("The item could not be found!");
						break;
					}
				}
			}
		}
		else {
			System.err.println("The operation could not be completed, as Clothing[i][j] was null.");
		}
	}
	public void print() {
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				if(Clothes[i][j] != null) {
					System.out.println(Clothes[i][j].toString());
				}
				else if(i == 4) {
					System.err.println("The operation could not be completed, as Clothing[i][j] was null.");
				}
			}
		}
	}
}
