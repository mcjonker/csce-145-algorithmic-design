/*
 * Property of Mitchell Jonker
 */

public class Coffee {
	private String name;
	private double caffeine;
	private double riskyCupAmount;
	
	public Coffee() { // Constructor
		this.name = "none";
		this.caffeine = 50.0;
	}
	public Coffee(String aN, double aV) {
		this.setName(aN);
		this.setCaffeine(aV);
	}
	// Accessors
	public String getName() {
		return this.name;
	}
	public double getCaffeine() {
		return this.caffeine;
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
	public void setCaffeine(double aV) {
		if(aV < 300 && aV > 50) { // Insures that the caffeine value entered is within the proper limits.
			this.caffeine = aV;
		}
		else {
			this.caffeine = 50;
		}
	}
	public String toString() { // Prints the coffee name and caffene
		return "Coffee Name: "+this.name+" Caffeine Amount: "+this.caffeine;
	}
	public double riskyAmount() {
		riskyCupAmount = (180)/((caffeine/100)*6);
		return riskyCupAmount;
	}
	public boolean equals(Coffee aC) { // If both elements are not equal, the coffee is not the same.
		return aC != null &&
				this.name.equals(aC.getName()) &&
				this.caffeine == aC.getCaffeine();
	}
}
