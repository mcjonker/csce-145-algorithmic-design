/*
 * Property of Mitchell Jonker
 */

public class Box {
	private String label;
	private double length;
	private double width;
	private double height;
	
	public Box() {
		this.label = "none";
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}
	public Box(String aS, double aL, double aW, double aH) {
		this.setLabel(aS);
		this.setLength(aL);
		this.setWidth(aW);
		this.setHeight(aH);
	}
	
	// Accessors
	public String getLabel() {
		return this.label;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
	// Mutators
	public void setLabel(String aS) {
		if(aS != null) {
			this.label = aS;
		}
		else {
			this.label = "none";
		}
	}
	public void setLength(double aD) {
		if(aD > 0) {
			this.length = aD;
		}
		else {
			this.length = 1;
		}
	}
	public void setWidth(double aD) {
		if(aD > 0) {
			this.width = aD;
		}
		else {
			this.width = 1;
		}
	}
	public void setHeight(double aD) {
		if(aD > 0) {
			this.height = aD;
		}
		else {
			this.height = 1;
		}
	}
	public double getVolume() {
		return this.height*this.length*this.width;
	}
	public String toString() {
		return "Label: "+this.label+" Volume: "+this.getVolume();
	}
}
