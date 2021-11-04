/*
 * Property of Mitchell Jonker
 */

public class Wheel {
	private double diameter;
	private double width;
	
	public Wheel() {
		this.diameter = 16;
		this.width = 1;
	}
	public Wheel(double aD, double aW) { // Parameterized Constructor
		this.setDiameter(aD);
		this.setWidth(aW);
	}
	// Accessors
	public double getDiameter() {
		return this.diameter;
	}
	public double getWidth() {
		return this.width;
	}
	// Mutators
	public void setDiameter(double aD) {
		if(aD >= 16 && aD <= 55) {
			this.diameter = aD;
		}
		else {
			this.diameter = 16;
		}
	}
	public void setWidth(double aW) { // Sets width if it is within the proper numerical bounds.
		if(aW >= 1 && aW <= 2.5) {
			this.width = aW;
		}
		else {
			this.width = 1;
		}
	}
	// Other Methods
	public String toString() {
		return "[Wheel] Diameter: "+this.diameter+" Width: "+this.width;
	}
	public boolean equals(Wheel aW) {
		return aW != null &&
				this.diameter == aW.getDiameter() &&
				this.width == aW.getWidth();
	}
}
