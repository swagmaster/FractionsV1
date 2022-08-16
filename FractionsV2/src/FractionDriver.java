
import java.io.*;
import java.util.Scanner;



public class FractionDriver {

	Scanner fileReader = null; 
	private int totalLineCount = 0;
	ObjectList myFractions = new ObjectList();
	Fractions[] fractionList = new Fractions[255];

	public static void main(String[] args){
		FractionDriver driver = new FractionDriver();
		driver.openFile();
		
		//driver.addToList();
		//driver.populateAndPrint();
		//driver.expand();
		//driver.closeTheFile();
	}

	 public void openFile() {
	        try{
	            fileReader = new Scanner (new FileInputStream("fractions.txt"));
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("Error. File not found.");
	        }
	        while(fileReader.hasNextLine()){
	            System.out.println(fileReader.hasNextLine());
	            fileReader.nextLine();
	            
	        }
	    }

	/****************************************************/
	/* Adding each fraction as a String to the object list
	 * This method will check if there is another line,
	 * then add that line to the next position in the listOfObjectsay
	 * stored in ObjectList */
	/****************************************************/
	public void addToList(){
		while(fileReader.hasNext()){
			myFractions.add(fileReader.nextLine());
			totalLineCount++;
		}
	}

	/****************************************************/
	/* This method contains a loop that goes over each	*/
	/* Fraction Object in the fractionList then passes	*/
	/* it to the constructor of a new FractionCounter	*/
	/* object. */
	/****************************************************/
	public void populateAndPrint(){
		for(int i=0;i<myFractions.fractionList.length;i++){
			FractionCounter fCounter = new FractionCounter(myFractions.fractionList[i]);	
			System.out.println(fCounter.toString());
		}
	}

	/****************************************************/
	/* this method will create a new listOfObjectsay, set the		*/
	/* size to 1 more than the length of the list of	*/
	/* fractionObjects. Copy the contents of the		*/
	/* original to the new, then set the old to the new	*/
	/* listOfObjectsay											*/
	/****************************************************/
	public void expand() {
		Fractions[] newFractionList = new Fractions[fractionList.length + 1];
		System.arraycopy(fractionList, 0, newFractionList, 0, fractionList.length);
		fractionList = newFractionList;
	}

	public int getTotalLineCount(){
		return totalLineCount;
	}

	public void setTotalLineCount(int totalLineCount){
		this.totalLineCount = totalLineCount;
	}
	//we're done, so let's close the file. :)
	public void closeTheFile(){
		fileReader.close();
	}
}