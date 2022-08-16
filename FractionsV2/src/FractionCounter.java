

public class FractionCounter {

	Fractions fraction = new Fractions();
	private int count = 1; //every newFraction counts as 1


	FractionCounter(Fractions theFraction){
		fraction = theFraction;
	}

	public boolean compareAndIncrement(Fractions newFraction){
		if(fraction.equals(newFraction)){
			count++;
			return true;
		} else {
			return false;
		}
	}

	public String toString(){
		return this.fraction.getNumerator() + "/" + this.fraction.getDenominator() + " has a count of " + count;
	}
}