/*
 * Property of Mitchell Jonker
 */

public class Dog extends Animal { // This extends clause causes the Dog class to inherit the Animal's class' contents as well as have unique elements.
	private int energyLevel;
	
	public Dog() {
		super(); // Default constructor from the parent class
		this.energyLevel = 0;
	}
	public Dog(String aN, double aW, int aE) {
		super(aN, aW);
		this.setEnergyLevel(aE);
	}
	// Accessors
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	// Mutators
	public void setEnergyLevel(int aE) {
		if(aE >= 0) {
			this.energyLevel = aE;
		}
		else {
			this.energyLevel = 0;
		}
	}
	// Other Methods
	public boolean equals(Dog aD) {
		return aD != null &&
				super.equals(aD) &&
				this.energyLevel == aD.getEnergyLevel();
	}
	public String toString() {
		return super.toString()+" Energy Level: "+this.energyLevel;
	}
}
