package composition;

//import java.util.Arrays;

public class MyCircle {
	// private variables
	private MyPoint center;
	private int radius;
	
	// default constructor
	public MyCircle() {
		center = new MyPoint();
		radius = 1;
	}
	
	// 2nd constructor, given int values
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
		//center.setX(x);
		//center.setY(y);
		this.radius = radius;
	}
	
	// 3rd constructor, given MyPoint, int radius
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public String toString() {
		return "MyCircle[radius=" + radius + ",center="
				+ center.toString() + "]";
	}
	
	// radius getters/setters
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// Center getters/setters
	public MyPoint getCenter()	{
		return center;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	
	public int[] getCenterXY() {
		return center.getXY();
	}
	
	// Area
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// Circumference
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public double distance(MyCircle another) {
		//return this.center.distance(another.center);
		int xDiff = this.getCenterX() - another.getCenterX();
		int yDiff = this.getCenterY() - another.getCenterY();
		return Math.sqrt(xDiff*xDiff - yDiff*yDiff);
	}
	
}
























