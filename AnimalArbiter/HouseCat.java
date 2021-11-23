/*
 * Property of Mitchell Jonker
 */

public class HouseCat extends Cat {
	private String type;
	
	public HouseCat() {
		super();
		this.type = "Short Hair";
	}
	public HouseCat(String aN, double aW, String aM, String aT) {
		super(aN, aW, aM);
		this.setType(aT);
	}
	// Accessors
	public String getType() {
		return this.type;
	}
	// Mutators
	public void setType(String aT) {
		if(aT != null) {
			if(aT.equalsIgnoreCase("Short Hair")) {
				this.type = "Short Hair";
			}
			if(aT.equalsIgnoreCase("Ragdoll")) {
				this.type = "Ragdoll";
			}
			if(aT.equalsIgnoreCase("Sphinx")) {
				this.type = "Sphinx";
			}
			if(aT.equalsIgnoreCase("Scottish Fold")) {
				this.type = "Scottish Fold";
			}
			else {
				this.type = "Short Hair";
			}
		}
		else {
			this.type = "Short Hair";
		}
	}
	// Other Methods
	public boolean equals(HouseCat aH) {
		return aH != null &&
				super.equals(aH) &&
				this.type == aH.getType();
	}
	public String toString() {
		return super.toString()+" Type: "+this.type;
	}
}
