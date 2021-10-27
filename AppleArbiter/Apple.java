/*
 * Property of Mitchell Jonker
 */

public class Apple {
	private String type; // Non-null, valid options: Red Delicious, Golden Delicious, Gala, Granny Smith, default gala.
	private double weight; // Between 0 and 2 inclusive, default 0.0.
	private double price; // non-negative, default is 0.0.
	
	public Apple() {
		this.type = "Gala"; // Default values
		this.weight = 0.0;
		this.price = 0.0;
	}
	public Apple(String aT, double aW, double aP) {
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	// Accessors
	public String getType() {
		return this.type;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPrice() 
	{
		return this.price;
	}
	// Mutators
	public void setType(String aT) {
		if(aT != null) {
			if(aT == "Gala") { // Insures that the only valid entries are these apple types.
				this.type = "Gala";
			}
			if(aT == "Red Delicious") {
				this.type = "Red Delicious";
			}
			if(aT == "Golden Delicious") {
				this.type = "Golden Delicious";
			}
			if(aT == "Granny Smith") {
				this.type = "Granny Smith";
			}
		}
		else {
			this.type = "Gala"; // If one of the previous are not the entry, it is invalid, therefore, assign default value.
		}
	}
	public void setWeight(Double aW) {
		if(aW > 0 && aW < 2) {
			this.weight = aW;
		}
		else {
			this.weight = 0.0;
		}
	}
	public void setPrice(Double aP) {
		if(aP > 0) {
			this.price = aP;
		}
		else {
			this.price = 0.0;
		}
	}
	public String toString() {
		return "Type: "+this.type+" Weight: "+this.weight+" Price: "+this.price; // Prints values of apple instance in a string.
	}
	public boolean equals(Apple aA) {
		return aA != null &&
				this.type.equals(aA.getType()) &&
				this.weight == aA.getWeight() &&
				this.price == aA.getPrice();
				
	}
}
