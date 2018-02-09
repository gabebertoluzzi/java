package ntuOOP1;
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
		
		// Declare an instance of class Circle called c3
		// Construct the instance c3 by invoking the third constructor
		//  with given radius and color
		Circle c3 = new Circle(3.0, "green");
		// Invoke the public methods on instance c3
		System.out.println("Circle c3 has radius of " + c3.getRadius()
				+ " and area of " + c3.getArea());
		
		// Getting the instance colors
		System.out.println("The color of c1 is " + c1.getColor());
		System.out.println("The color of c2 is " + c2.getColor());
		System.out.println("The color of c3 is " + c3.getColor());
		
		// Testing public vs private
		// using .getRadius works as it is public/visible
		//  vs .radius is which private/not visible
		//System.out.println(c1.radius);
		//c1.radius = 3.0;
		
		// Testing setters
		c3.setColor("black");
		c3.setRadius(12.0);
		System.out.println("The new color of c3 is " + c3.getColor() +
				" and the radius is " + c3.getRadius());
		
		// implicit toString call
		System.out.println(c1);
		// Explicit toString call
		System.out.println(c2.toString());
	}
}
