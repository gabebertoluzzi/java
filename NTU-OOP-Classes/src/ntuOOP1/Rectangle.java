package ntuOOP1;

public class Rectangle {
	// private variables for class Rectangle
	private float length;
	private float width;
	
	// 1st constructor, length and width are default values
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	// 2nd constructor, length and width are given values
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	// Getter for length
	public float getLength() {
		return this.length;
	}
	
	// Setter for length
	public void setLength(float length) {
		this.length = length;
	}
	
	// Getter for width
	public float getWidth() {
		return this.width;
	}
	
	// Setter for width
	public void setWidth(float width) {
		this.width = width;
	}
	
	// Getter for Area of the Rectangle
	public double getArea() {
		return length * width;
	}
	
	// Get for Perimeter of Rectangle
	public double getPerimeter() {
		return length + length + width + width;
	}
	
	public String toString() {
		return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
	}
}
