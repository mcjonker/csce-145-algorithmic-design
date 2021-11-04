/*
 * Property of Mitchell Jonker
 */

public class Frame {
	private double size;
	private String type;
	
	public Frame() {
		this.size = 18.5;
		this.type = "Diamond";
	}
	public Frame(double aS, String aT) {
		this.setSize(aS);
		this.setType(aT);
	}
	// Accessors
	public double getSize() {
		return this.size;
	}
	public String getType() {
		return this.type;
	}
	// Mutators
	public void setSize(double aS) {
		if(aS >= 18.5 && aS<= 60) {
			this.size = aS;
		}
		else {
			this.size = 18.5;
		}
	}
	public void setType(String aT) { // Only allows type to be the user entered string if it is one of the approved names.
		if(aT != null) {
			if(aT.equalsIgnoreCase("Diamond")) { // equalsIgnoreCase allows the user to neglect capitalization, but maintains consistent output capitalization.
				this.type = "Diamond";
			}
			if(aT.equalsIgnoreCase("Step-Through")) {
				this.type = "tep-Through";
			}
			if(aT.equalsIgnoreCase("Truss")) {
				this.type = "Truss";
			}
			if(aT.equalsIgnoreCase("Penny-Farthing")) {
				this.type = "Penny-Farthing";
			}
			else {
				this.type = "Diamond";
			}
		}
		else {
			this.type = "Diamond";
		}
	}
	// Other Methods
	public String toString() {
		return "[Frame] Size: "+this.size+" Type: "+this.type;
	}
	public boolean equals(Frame aF) {
		return aF != null &&
				this.size == aF.getSize() &&
				this.type == aF.getType();
	}
}
