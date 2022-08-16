import java.util.Arrays;

public class ObjectList {

	private int numFractions = 0;
	private String[] listOfFractions = new String[100];
	Fractions[] fractionList = new Fractions[255];

	/****************************************************/
	/* Add the line from the file to the next index of  */
	/* the listOfObjectsay. */
	/****************************************************/
	public void add(String f) {
		listOfFractions[numFractions++] = f;
	}
	
	/****************************************************/
	/* This method creates a string listOfObjectsay that will     */
	/* contain two elements - the left and right side of*/
	/* the fraction. The numerator and denominator are  */
	/* sent to the ctor of Fraction. */
	/****************************************************/
	public Fractions[] repopulatelistOfObjectsay(){
		String[] splitFractions = new String[2];
		for(int i=0;i<numFractions;i++){
			splitFractions = listOfFractions[i].split("/");
			Fractions theFraction = new Fractions (Integer.parseInt(splitFractions[0]), Integer.parseInt(splitFractions[1]));
			fractionList[i] = theFraction;
		}
		return fractionList;
	}
	
	public String toString(){
		return Arrays.toString(fractionList);
	}
	
	public void expand() {
	    Fractions[] newFractionList = new Fractions[fractionList.length + 1];
	    System.arraycopy(fractionList, 0, newFractionList, 0, fractionList.length);
	    fractionList = newFractionList;
	}
	
	public Fractions[] getFractionList(){
		return fractionList;
	}
	
	public void setFractionList(Fractions[] fractionList){
		this.fractionList = fractionList;
	}
	
	public int getNumFractions(){
		return numFractions;
	}
	
	public void setNumFractions(int numFractions){
		this.numFractions = numFractions;
	}
}