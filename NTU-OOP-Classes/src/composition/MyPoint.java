package composition;

public class MyPoint {
	private int x;
	private int y;
	
	// Default constructor
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	// 2nd Constructor, given x and y values
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// X getters/setters
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	// Y getters/setters
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// XY getters/setters
	public int[] getXY() {
		int[] xyArray = new int[2];
		xyArray[0] = x;
		xyArray[1] = y;
		return xyArray;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	// toString
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// distance methods
	public double distance(int x, int y) {
		//...
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint anotherPoint) {
		// ...
		int xDiff = this.x - anotherPoint.getX();
		int yDiff = this.y - anotherPoint.getY();
		return Math.sqrt(xDiff*xDiff - yDiff*yDiff);
	}
	
	public double distance() {
		// from (0,0) centerpoint
		return Math.sqrt(x*x - y*y);
		
	}
	
}
