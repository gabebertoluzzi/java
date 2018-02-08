/*
 * The Circle class models a circle with a radius and color
 */
public class Circle {
	// Private instance variable, not accessible from outside this class
	private double radius;
	private String color;
	
	// The default constructor with no argument.
	// It sets the radius and color to their default value.
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	// 2nd constructor with given radius, but color default.
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	// 3rd constructor with given radius and color
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	// A public method for retrieving the radius.
	public double getRadius() {
		return radius;
	}
	
	// A public method for computing the area of circle.
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
