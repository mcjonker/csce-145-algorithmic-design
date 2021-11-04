/*
 * Property of Mitchell Jonker
 */

public class PBJSandwich {
	private Bread TopSlice;
	private PeanutButter PeanutButter;
	private Jelly Jelly;
	private Bread BottomSlice;
	
	public PBJSandwich() {
		this.TopSlice = new Bread();
		this.PeanutButter = new PeanutButter();
		this.Jelly = new Jelly();
		this.BottomSlice = new Bread();
	}
	public PBJSandwich(String aN, int aC, String aT, String bN, int bC, boolean bB, String cN, int cC, String cS, String dN, int dC, String dT) {
		this.setTopSlice(aN, aC, aT);
		this.setPeanutButter(bN, bC, bB);
		this.setJelly(cN, cC, cS);
		this.setBottomSlice(dN, dC,dT);
	}
	// Accessors
	public String getTopSlice() {
		return TopSlice.toString();
	}
	public String getPeanutButter() {
		return PeanutButter.toString();
	}
	public String getJelly() {
		return Jelly.toString();
	}
	public String getBottomSlice() {
		return BottomSlice.toString();
	}
	// Mutators
	public void setTopSlice(String aN, int aC, String aT) {
		TopSlice.setName(aN);
		TopSlice.setCalories(aC);
		TopSlice.setType(aT);
	}
	public void setPeanutButter(String bN, int bC, boolean bB) {
		PeanutButter.setName(bN);
		PeanutButter.setCalories(bC);
		PeanutButter.setIsCrunchy(bB);
	}
	public void setJelly(String cN, int cC, String cS) {
		Jelly.setName(cN);
		Jelly.setCalories(cC);
		Jelly.setFruitType(cS);
	}
	public void setBottomSlice(String dN, int dC, String dT) {
		BottomSlice.setName(dN);
		BottomSlice.setCalories(dC);
		BottomSlice.setType(dT);
	}
	
	// Other Methods
	public String toString() {
		return TopSlice.toString()+"\n"+PeanutButter.toString()+"\n"+Jelly.toString()+"\n"+BottomSlice.toString();
	}
	public boolean equals(PBJSandwich aP) {
		return aP != null &&
				//this.getTopSlice() == aP.getTopSlice() &&
				//this.getPeanutButter() == aP.getPeanutButter() &&
				//this.getJelly() == aP.getJelly() &&
				//this.getBottomSlice() == aP.getBottomSlice();
				this.toString().equalsIgnoreCase(aP.toString());
	}
}
