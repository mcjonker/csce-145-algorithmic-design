/*
 * Property of Mitchell Jonker
 */

public class Animal {
	private String name;
	private double weight;
	
	public Animal() {
		this.name = "none"; // Default values
		this.weight = 1.0; 
	}
	public Animal(String aN, double aW) {
		this.setName(aN);
		this.setWeight(aW);
	}
	// Accessors
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	// Mutators
	public void setName(String aN) {
		if(aN != null) {
			this.name = aN;
		}
		else {
			this.name = "none";
		}
	}
	public void setWeight(Double aW) {
		if(aW > 0) { // Insures the value is non-zero and positive before assigning the inputted value. if condition is not met, set to default value.
			this.weight = aW;
		}
		else {
			this.weight = 1.0;
		}
	}
	// Other Methods
	public boolean equals(Animal aM) {
		return aM != null &&
				this.name == aM.getName() &&
				this.weight == aM.getWeight();
	}
	public String toString() {
		return "Name: "+this.name+" Weight: "+this.weight;
	}
}
