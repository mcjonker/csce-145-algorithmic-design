/*
 * Property of Mitchell Jonker
 */

public class Leopard extends Cat {
	private int numberOfSpots;
	
	public Leopard() {
		super();
		this.numberOfSpots = 1;
	}
	public Leopard(String aN, double aW, String aM, int nS) {
		super(aN, aW, aM);
		this.setNumberOfSpots(nS);
	}
	// Accessors
	public int getNumberOfSpots() {
		return this.numberOfSpots;
	}
	// Mutators
	public void setNumberOfSpots(int nS) {
		if(nS > 0) {
			this.numberOfSpots = nS;
		}
		else {
			this.numberOfSpots = 1;
		}
	}
	// Other Methods
	public boolean equals(Leopard aL) {
		return aL != null &&
				super.equals(aL) &&
				this.numberOfSpots == aL.getNumberOfSpots();
	}
	public String toString() {
		return super.toString()+" Number of Spots: "+this.numberOfSpots;
	}
}
