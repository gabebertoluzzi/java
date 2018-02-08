// mac change


public class TestCircle {
	public static void main(String[] args) {
		// Declare an instance of Circle class called c1.
		// Construct the instance c1 by invoking the "default" constructor
		//  which sets its radius and color to the default values.
		Circle c1 = new Circle();
		//Invoke public methods on instance c1
		System.out.println("Circle c1 has radius " + c1.getRadius() + 
				" and area " + c1.getArea());
		
		// Declare an instance of class Circle called c2.
		// Construct the instance c2 by invoking the second constructor
		//  with the given radius and default color.
		Circle c2 = new Circle(2.0);
		// Invoke public methods on instance c2
		System.out.println("Circle c2 has radius " + c2.getRadius() + 
				" and area " + c2.getArea());
	}
}
