/*
 * Property of Mitchell Jonker
 */

public class DomesticDog extends Dog {
	private String type;
	
	public DomesticDog() {
		super();
		this.type = "Mutt";
	}
	public DomesticDog(String aN, double aW, int aE, String aT) {
		super(aN, aW, aE);
		this.setType(aT);
	}
	// Accessors
	public String getType() {
		return this.type;
	}
	// Mutators
	public void setType(String aT) {
		if(aT != null) {
			if(aT.equalsIgnoreCase("Mutt")) {
				this.type = "Mutt";
			}
			if(aT.equalsIgnoreCase("Retriever")) {
				this.type = "Retriever";
			}
			if(aT.equalsIgnoreCase("Terrier")) {
				this.type = "Terrier";
			}
			if(aT.equalsIgnoreCase("Husky")) {
				this.type = "Husky";
			}
			else {
				this.type = "Mutt";
			}
		}
		else {
			this.type = "Mutt";
		}
	}
	// Other Methods
	public boolean equals(DomesticDog aD) {
		return aD != null &&
				super.equals(aD) &&
				this.type == aD.getType();
	}
	public String toString() {
		return super.toString()+" Type: "+this.type;
	}
}
