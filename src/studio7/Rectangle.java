package studio7;

public class Rectangle {

	//instance variable
	private int length;
	private int width;
	
	//constructor method
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int Area() {
		return (this.length * this.width);
	}
	
	public int Perimeter() {
		return ((this.length * 2) + (this.width * 2));
	}
	
	
	public String toString() {
		return "The length of the rectangle is " + this.length + " and the width is " + this.width + ".";
	}
	
	public boolean Comparison(Rectangle recz2) {
		if (this.Area() < recz2.Area())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.length == this.width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Rectangle recz = new Rectangle(10, 20);
		System.out.println(recz.Area());
		System.out.println(recz.Perimeter());
		System.out.println(recz);
		Rectangle recz2 = new Rectangle(5, 10);
		System.out.println(recz.Comparison(recz2));
		System.out.println(recz.isSquare());
	}
	
}
