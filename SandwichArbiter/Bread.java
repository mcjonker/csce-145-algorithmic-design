/*
 * Property of Mitchell Jonker
 */

public class Bread {
	private String name;
	private int calories;
	private String type;
	
	public Bread() {
		this.name = "none";
		this.calories = 50;
		this.type = "Whole Grain";
	}
	public Bread(String aN, int aC, String aT) {
		this.setName(aN);
		this.setCalories(aC);
		this.setType(aT);
	}
	
	// Accessors
	public String getName() {
		return this.name;
	}
	public int getCalories() {
		return this.calories;
	}
	public String getType() {
		return this.type;
	}
	
	// Mutators
	public void setName(String aN) {
		if(aN != null) {
			this.name = aN;
		}
		else {
			this.name = "none"; // If address is null, set to default value.
		}
	}
	public void setCalories(int aC) {
		if(aC > 50 && aC < 250) {
			this.calories = aC;
		}
		else {
			this.calories = 50;
		}
	}
	public void setType(String aT) {
		if(aT != null) {
			if(aT.equalsIgnoreCase("Whole Grain")) { // Insures that the only valid entries are these bread types.
				this.type = "Whole Grain";
			}
			if(aT.equalsIgnoreCase("Honey Wheat")) {
				this.type = "Honey Wheat";
			}
			if(aT.equalsIgnoreCase("White")) {
				this.type = "White";
			}
			if(aT.equalsIgnoreCase("Whole Wheat")) {
				this.type = "Whole Wheat";
			}
		}
		else {
			this.type = "Whole Grain"; // If one of the previous are not the entry, it is invalid, therefore, assign default value.
		}
	}
	
	// Other methods
	public String toString() {
		return "Bread: Name (Brand): "+this.name+" Calories: "+this.calories+" Type: "+this.type; // Prints all of the information for the bread class.
	}
	public boolean equals(Bread aB) {
		return aB != null &&
				//this.name.equals(aB.getName()) &&
				this.calories == aB.getCalories() &&
				this.type.equals(aB.getType());
	}
}
