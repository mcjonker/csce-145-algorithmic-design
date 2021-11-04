/*
 * Property of Mitchell Jonker
 */

public class Clothing {
	private String type;
	private String color;
	
	public Clothing() {
		this.type = "Socks";
		this.color = "Black";
	}
	public Clothing(String aT, String aC) { // Parameterized Constructor
		this.setType(aT);
		this.setColor(aC);
	}
	// Accessors
	public String getType() {
		return this.type;
	}
	public String getColor() {
		return this.color;
	}
	// Mutators
	public void setType(String aT) { // Makes sure that the type entered is only a valid name, corrects caps if needed.
		if(aT != null) {
			if(aT.equalsIgnoreCase("Socks")) {
				this.type = "Socks";
			}
			if(aT.equalsIgnoreCase("Undergarment")) {
				this.type = "Undergarment";
			}
			if(aT.equalsIgnoreCase("Stockings")) {
				this.type = "Stockings";
			}
			if(aT.equalsIgnoreCase("Top")) {
				this.type = "Top";
			}
			if(aT.equalsIgnoreCase("Bottom")) {
				this.type = "Bottom";
			}
			if(aT.equalsIgnoreCase("Cape")) {
				this.type = "Cape";
			}
		}
		else {
			this.type = "Socks";
		}
		if(this.type == null) { // if no type is entered, set to the default.
			this.type = "Socks";
		}
	}
	public void setColor(String aS) { // String logic insures that only valid colors are ever stored to the object's color variable.
		if(aS != null) {
			if(aS.equalsIgnoreCase("Black")) {
				this.color = "Black";
			}
			if(aS.equalsIgnoreCase("Brown")) {
				this.color = "Brown";
			}
			if(aS.equalsIgnoreCase("Red")) {
				this.color = "Red";
			}
			if(aS.equalsIgnoreCase("Pink")) {
				this.color = "Pink";
			}
			if(aS.equalsIgnoreCase("White")) {
				this.color = "White";
			}
			if(aS.equalsIgnoreCase("Orange")) {
				this.color = "Orange";
			}
			if(aS.equalsIgnoreCase("Green")) {
				this.color = "Green";
			}
			if(aS.equalsIgnoreCase("Blue")) {
				this.color = "Blue";
			}
			if(aS.equalsIgnoreCase("Purple")) {
				this.color = "Purple";
			}
			if(aS.equalsIgnoreCase("Grey")) {
				this.color = "Grey";
			}
		}
		else {
			this.color = "Black";
		}
		if(this.color == null) {
			this.color = "Black";
		}
	}
	// Other Methods
	public String toString() { // Print the type and the color in consistent format.
		return "[Clothing] Type: "+this.type+" Color: "+this.color;
	}
	public boolean equals(Clothing aC) {
		return aC != null &&
				this.type == aC.getType() &&
				this.color == aC.getColor();
	}
}
