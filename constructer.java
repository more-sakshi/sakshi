import java.util.Scanner;

class Rectangle {
	
	double length, width, area;
	String colour;
	
	public double getLength() {
		return length;
	}
	public void setLength() {
		Scanner len = new Scanner(System.in);
		System.out.println("Enter Length: ");
		length = len.nextDouble();
	}
	public double getWidth() {
		return width;
	}
	public void setWidth() {
		Scanner wid = new Scanner(System.in);
		System.out.println("Enter Width: ");
		width = wid.nextDouble();
	}
	public double getArea() {
		area = getLength()*getWidth();
		return area;
	}
	public String getColour() {
		return colour;
	}
	public void setColour() {
		Scanner colr = new Scanner(System.in);
		System.out.println("Enter Colour: ");
		colour = colr.next();
	}
	
}

public class Shapes {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle();
		R1.setLength();
		R1.setWidth();
		R1.setColour();
		
		Rectangle R2 = new Rectangle();
		R2.setLength();
		R2.setWidth();
		R2.setColour();
		
		if(R1.getArea()==R2.getArea() && R1.colour.equals(R2.colour)) {
			System.out.println("Matching Rectangles");
		}
		else {
			System.out.println("Non-Matching Rectangles");
		}
		
	}

}
