
public class SimpleCircle {
	// private instance variable
	private double radius;
	
	// First constructor, default radius
	public SimpleCircle() {
		this.radius = 1.0;
	}
	
	// Second constructor, given radius variable
	public SimpleCircle(double radius) {
		this.radius = radius;
	}
	
	// Getter for radius variable
	public double getRadius() {
		return this.radius;
	}
	
	// Setter for radius variable
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Getter for Area of circle (PI r ^ 2)
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// Getter for Circle's Circumference (2PIr)
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	// SimpleCircle toString (Circle[radius=?])
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
}
