/*
 * Property of Mitchell Jonker
 */

public class Wolf extends Dog {
	private String packLeader;
	
	public Wolf() {
		super();
		this.packLeader = "none";
	}
	public Wolf(String aN, double aW, int aE, String aP) {
		super(aN, aW, aE);
		this.setPackLeader(aP);
	}
	// Accessors
	public String getPackLeader() {
		return this.packLeader;
	}
	// Mutators
	public void setPackLeader(String aP) {
		if(aP != null) {
			this.packLeader = aP;
		}
	}
	// Other Methods
	public boolean equals(Wolf aW) {
		return aW != null &&
				super.equals(aW) &&
				this.packLeader == aW.getPackLeader();
	}
	public String toString() {
		return super.toString()+" Pack Leader: "+this.packLeader;
	}
}
