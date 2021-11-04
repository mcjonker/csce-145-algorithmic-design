/*
 * Property of Mitchell Jonker
 */

public class PeanutButter {
	private String name;
	private int calories;
	private boolean isCrunchy;
	
	public PeanutButter() {
		this.name = "none";
		this.calories = 100;
		this.isCrunchy = false;
	}
	public PeanutButter(String aN, int aC, boolean aB) {
		this.setName(aN);
		this.setCalories(aC);
		this.setIsCrunchy(aB);
	}
	// Accessors
	public String getName() {
		return this.name;
	}
	public int getCalories() {
		return this.calories;
	}
	public boolean getIsCrunchy() {
		return this.isCrunchy;
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
		if(aC > 100 && aC < 300) {
			this.calories = aC;
		}
		else {
			this.calories = 100;
		}
	}
	public void setIsCrunchy(boolean aB) {
		if(aB != false) {
			this.isCrunchy = aB;
		}
		else {
			this.isCrunchy = false;
		}
	}
	// Other methods
	public String toString() {
		return "Peanut Butter: Name (Brand): "+this.name+" Calories: "+this.calories+" Crunchy: "+this.isCrunchy; // Prints all of the information in a single string
	}
	public boolean equals(PeanutButter aP) {
		return aP != null &&
				//this.name.equals(aP.getName()) &&
				this.calories == aP.getCalories() &&
				this.isCrunchy == aP.getIsCrunchy();
	}
}
