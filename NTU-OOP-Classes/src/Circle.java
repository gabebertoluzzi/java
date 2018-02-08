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
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	
	// 3rd constructor with given radius and color
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// A public method for retrieving the radius.
	public double getRadius() {
		return this.radius;
	}
	
	// A public method for computing the area of circle.
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	// Getter for Circle's color
	public String getColor() {
		return this.color;
	}
	
	// Setter for instance variable radius
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	// Setter for instance variable color
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	// toString - Return a description of this instance
	// Circle[radius=r,color=c]
	public String toString() {
		return "Circle[radius=" + this.radius + "color=" + this.color + "]";
	}
}
