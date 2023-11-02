package studio7;

public class Die {
	
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int Roll() {
		return (int) (Math.random()*this.sides) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die(18);
		System.out.println(die1.Roll());

	}

}
