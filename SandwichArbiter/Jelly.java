/*
 * Property of Mitchell Jonker
 */

public class Jelly {
	private String name;
	private int calories;
	private String FruitType;
	
	public Jelly() {
		this.name = "none";
		this.calories = 50;
		this.FruitType = "Apple";
	}
	public Jelly(String aN, int aC, String aS) {
		this.setName(aN);
		this.setCalories(aC);
		this.setFruitType(aS);
	}
	
	// Accessors
	public String getName() {
		return this.name;
	}
	public int getCalories() {
		return this.calories;
	}
	public String getFruitType() {
		return this.FruitType;
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
	public void setCalories(int aC) {
		if(aC > 50 && aC < 200) {
			this.calories = aC;
		}
		else {
			this.calories = 50;
		}
	}
	public void setFruitType(String aS) {
		if(aS != null) {
			if(aS.equalsIgnoreCase("Apple")) { // Insures that the only valid entries are these bread types.
				this.FruitType = "Apple";
			}
			if(aS.equalsIgnoreCase("Blackberry")) {
				this.FruitType = "Blackberry";
			}
			if(aS.equalsIgnoreCase("Grape")) {
				this.FruitType = "Grape";
			}
			if(aS.equalsIgnoreCase("Mango")) {
				this.FruitType = "Mango";
			}
			if(aS.equalsIgnoreCase("Tomato")) {
				this.FruitType = "Tomato";
			}
		}
		else {
			this.FruitType = "Apple"; // If one of the previous are not the entry, pick Apple.
		}
	}
	
	// Other methods
	public String toString() {
		return "Jelly: Name (Brand): "+this.name+" Calories: "+this.calories+" Fruit Type: "+this.FruitType;
	}
	public boolean equals(Jelly aJ) {
		return aJ != null &&
				this.calories == aJ.getCalories();
	}
}
