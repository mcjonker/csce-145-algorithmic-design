/*
 * Property of Mitchell Jonker 
 */

public class AnimalCollection {
	private Animal[] animals;
	
	public AnimalCollection() {
		this.animals = new Animal[10];
	}
	// Methods
	public void addAnimal(Animal aA) {
		if(aA != null) {
			for(int i = 0; i < 10; i++) {
				if(animals[i] == null) {
					animals[i] = aA;
					System.out.println(aA.getName()+" was added to the collection.");
					break;
				}
				else if(i == 9) {
					System.out.println("The collection is full.");
					break;
				}
			}
		}
	}
	public void removeAnimal(String aN) {
		if(aN != null) {
			for(int j = 0; j < 10; j++) {
				if(animals[j] != null && animals[j].getName().equalsIgnoreCase(aN)) {
					animals[j] = null;
					System.out.println("The animal named "+aN+" was removed from the collection.");
					break;	
				}
				else if(j == 9) { // If the final cycle of the for loop does not find a matching animal in any of the positions, notify the user that the animal could not be found.
					System.out.println("The animal could not be found!");
					break;
				}
			}
		}
	}
	public void printAnimals() {
		for(int k = 0; k < 10; k++) {
			if(animals[k] != null) {
				System.out.println(animals[k].toString());
			}
		}
	}
}
