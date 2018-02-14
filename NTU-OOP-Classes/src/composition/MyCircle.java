package composition;

public class MyCircle {
	// private vars
	private MyPoint center;
	private int radius;
	
	// default constructor
	public MyCircle() {
		center = new MyPoint();
		radius = 1;
	}
	
	// 2nd constructor, given int values
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint();
		center.setX(x);
		center.setY(y);
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
}
