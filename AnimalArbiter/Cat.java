/*
 * Property of Mitchell Jonker
 */

public class Cat extends Animal { // This extends clause causes the Cat class to inherit the Animal's class' contents as well as have unique elements.
	private String mood;
	
	public Cat() {
		super(); // Default constructor from the parent class
		this.mood = "sleepy";
	}
	public Cat(String aN, double aW, String aM) {
		super(aN, aW);
		this.setMood(aM);
	}
	// Accessors
	public String getMood() {
		return this.mood;
	}
	// Mutators
	public void setMood(String aM) {
		if(aM != null) {
			if(aM.equalsIgnoreCase("Sleepy")) {
				this.mood = "Sleepy";
			}
			if(aM.equalsIgnoreCase("Playful")) {
				this.mood = "Playful";
			}
			if(aM.equalsIgnoreCase("Hungry")) {
				this.mood = "Hungry"; // Varying from the documentation, I am taking personal liberty to change this to "hungry" as it fits better grammatically.
			}
			else {
				this.mood = "Sleepy";
			}
		}
		else {
			this.mood = "Sleepy";
		}
	}
	// Other Methods
	public boolean equals(Cat aC) {
		return aC != null &&
				super.equals(aC) &&
				this.mood == aC.getMood();
	}
	public String toString() {
		return super.toString()+" Mood: "+this.mood;
	}
}
