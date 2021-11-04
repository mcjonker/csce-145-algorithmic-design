/*
 * Property of Mitchell Jonker
 */

public class Bicycle {
	private String make;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame Frame;
	
	public Bicycle() {
		this.make = "none";
		this.FrontWheel = new Wheel(16,1);
		this.BackWheel = new Wheel(16,1);
		this.Frame = new Frame(18.5,"Diamond");
	}
	public Bicycle(String aM, Wheel aW, Wheel bW, Frame aF) { // Intakes each class needed to make a bike.
		this.setMake(aM);
		this.setFrontWheel(aW);
		this.setBackWheel(bW);
		this.setFrame(aF);
	}
	// Accessors
	public String getMake() {
		return this.make;
	}
	public Wheel getFrontWheel() {
		return this.FrontWheel;
	}
	public Wheel getBackWheel() {
		return this.BackWheel;
	}
	public Frame getFrame() {
		return this.Frame;
	}
	// Mutators
	public void setMake(String aM) {
		if(aM != null) {
			this.make = aM;
		}
		else {
			this.make = "none";
		}
	}
	public void setFrontWheel(Wheel aW) {
		FrontWheel = aW; // Sets FrontWheel to the aW entered into the FrontEnd (BicycleBuilderTester)
	}
	public void setBackWheel(Wheel bW) {
		BackWheel = bW;
	}
	public void setFrame(Frame aF) {
		Frame = aF;
	}
	// Other Methods
	public String toString() {
		return "[Bicycle] Make: "+this.make+"\nFront Wheel: "+FrontWheel.toString()+"\nBack Wheel: "+BackWheel.toString()+"\nFrame: "+Frame.toString(); //Prints string of bicycle specs - Make, front and back wheels, and frame.
	}
	public boolean equals(Bicycle aB) {
		return aB != null &&
				this.toString().equalsIgnoreCase(aB.toString()); // Since the strings are of the same form, if they are the same, the equalsIgnoreCase will determine.
	}
}
