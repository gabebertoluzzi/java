package ntuOOP1;

public class TestRectangle {

	public static void main(String[] args) {
		// Declare instance of Rectangle
		// using 1st constructor
		Rectangle r1 = new Rectangle();
		// Invoke public methods of r1 (getters)
		System.out.println("r1 length: " + r1.getLength()
		+ " r1 width: " + r1.getWidth());
		System.out.println("r1 Area: " + r1.getArea());
		System.out.println("r1 Perimeter: " + r1.getPerimeter());
		// Explicit toString of r1
		System.out.println(r1.toString());
		// Implicit toString of r1
		System.out.println(r1);
		
		
		// Declare instance of Rectangle
		// using 2nd constructor
		Rectangle r2 = new Rectangle(3.5f, 6.5f);
		// Invoke public methods of r2
		System.out.println("r2 length: " + r2.getLength()
				+ " r2 width: " + r2.getWidth());
		System.out.println("r2 Area: " + r2.getArea());
		System.out.println("r2 Perimeter: " + r2.getPerimeter());
		// Explicit toString of r2
		System.out.println(r2.toString());
		// Implicit toString of r2
		System.out.println(r2);
		
		// r1 Setters
		r1.setLength(12.0f);
		r1.setWidth(15.0f);
		System.out.println("r1 setters impact via area: " + r1.getArea());
		// r2 Setters
		r2.setLength(112.0f);
		r2.setWidth(115.0f);
		System.out.println("r2 setters impact via perimeter: " + r2.getPerimeter());		


	}

}
