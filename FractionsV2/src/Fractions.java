

public class Fractions {

	private int numerator, denominator;
	
	public Fractions() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Fractions(int newNum, int newDom) {
		int [] fractionHolder = new int[2];
		fractionHolder = reduce(numerator,denominator);
		this.numerator = fractionHolder[0];
		this.denominator = fractionHolder[1];
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public static int gcd(int numerator, int denominator) {
		while(numerator!=0 && denominator!=0) {
		     int a = denominator;
		     denominator = numerator % denominator;
		     numerator = a;
		  }
		return numerator + denominator; 
	}
	
	public int[] reduce(int numerator, int denominator){
		int gcd = gcd(numerator, denominator);
		int[] reducedFractions = new int[2];
		int reducedNumerator = numerator/gcd;
		int reducedDenominator = denominator/gcd;
		reducedFractions[0] = reducedNumerator;
		reducedFractions[1] = reducedDenominator;
		return reducedFractions;
	}
	
	public boolean equals(Fractions other) {
		return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());
	}
	
	public String toString() {
		return this.getNumerator() + "/" + this.getDenominator();
	}
}







