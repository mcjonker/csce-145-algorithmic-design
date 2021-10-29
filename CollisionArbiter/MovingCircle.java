/*
 * Property of Mitchell Jonker
 */

public class MovingCircle {
	private double pX; // Positions
	private double pY;
	private double d; // Diameter
	private double vX; // Velocities
	private double vY;
	
	// Constructor
	public MovingCircle() {
		this.pX = 0;
		this.pY = 0;
		this.d = 0;
		this.vX = 0;
		this.vY = 0;
	}
	public MovingCircle(double apX, double apY, double ad, double avX, double avY) {
		this.setPosX(apX);
		this.setPosY(apY);
		this.setDiameter(ad);
		this.setVelocityX(avX);
		this.setVelocityY(avY);
	}
	// Accessors
	public double getPosX() {
		return this.pX;
	}
	public double getPosY() {
		return this.pY;
	}
	public double getDiameter() {
		return this.d;
	}
	public double getVelocityX() {
		return this.vX;
	}
	public double getVelocityY() {
		return this.vY;
	}
	// Mutators
	public void setPosX(double apX) {
			this.pX = apX;
	}
	public void setPosY(double apY) {	
			this.pY = apY;
	}
	public void setDiameter(double ad) {
		if(ad > 0) { // Insures that the diameter is a positive value.
			this.d = ad;
		}
		else {
			this.d = 0;
		}
	}
	public void setVelocityX(double avX) {
			this.vX = avX;
	}
	public void setVelocityY(double avY) {
			this.vY = avY;
	}
	// Other methods
	public boolean equals(MovingCircle aC) {
		return aC != null &&
				this.pX == aC.getPosX() &&
				this.pY == aC.getPosY() &&
				this.d == aC.getDiameter() &&
				this.vX == aC.getVelocityX() &&
				this.vY == aC.getVelocityY();	
	}
	public String toString() { //Prints the current values of the circle's variables.
		return "[Circle] X: "+this.pX+" Y: "+this.pY+" Diameter: "+this.d+" Velocity X: "+this.vX+" Velocity Y: "+this.vY;
	}
	public void move() {
		this.pX = this.pX + (this.vX);
		this.pY = this.pY + (this.vY);
	}	
	public boolean isColliding(MovingCircle aC) {
		return aC != null && // If address is not null and the distance formula shows that the item's distance is greater than or equal to the other circle.
				((aC.getDiameter()+this.d)/2) >= Math.sqrt(Math.pow((aC.getPosX() - this.pX), 2) + Math.pow((aC.getPosY() - this.pY), 2));				
	}
}