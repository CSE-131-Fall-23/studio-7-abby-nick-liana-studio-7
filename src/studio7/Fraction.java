package studio7;

public class Fraction {
	private int numer;
	private int denomer;
	
	public Fraction(int numer, int  denomer) {
		this.numer = numer;
		this.denomer = denomer;
	}
	
	public Fraction Simplify() {
		int startNum;
		if (denomer>numer) {
			startNum = denomer;
		} else {
			startNum = numer;
		}
		
		for (int i=startNum; i>0; i--) {
			int gcf;
			if (denomer%i == 0 && numer%i == 0) {
				return new Fraction(numer/i, denomer/i);
			} 
		}
		return this;
		}
	
	public String toString() {
		return this.numer+ "/" + this.denomer;
	}
	
	public Fraction Add(Fraction frac1) {
		int numerAdd = this.numer * frac1.denomer + frac1.numer * this.denomer;
		int denomerAdd = this.denomer * frac1.denomer;
		return new Fraction(numerAdd, denomerAdd).Simplify();
	}
	
	public Fraction Multiply(Fraction frac1) {
		return new Fraction(this.numer*frac1.numer, this.denomer*frac1.denomer).Simplify();
	}
	
	public static void main(String[] args) {
		Fraction fraccy = new Fraction(10,11);
		Fraction fraclin = new Fraction(2,3);
		System.out.println(fraccy.Simplify());
		System.out.println(fraccy.Add(fraclin));
		System.out.println(fraccy.Multiply(fraclin));

		
	}

}
