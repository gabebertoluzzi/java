package composition;

import java.util.Arrays;

public class MyTriangle {
	// private variables
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	// Constructors with given x/y values
	public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3) {
		v1 = new MyPoint(x1, y1);
		v2 = new MyPoint(x2, y2);
		v3 = new MyPoint(x3, y3);
	}
	
	// 2nd constructor
	public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	// public methods
	public String toString() {
		return "MyTriangle[v1=" + Arrays.toString(v1.getXY()) +
				",v2=" + Arrays.toString(v2.getXY()) + ",v3=" + 
				Arrays.toString(v3.getXY());
	}
	
	public double getPerimeter() {
		return v1.distance() + v2.distance() + v3.distance();
	}
	
	public String getType() {
		if (v1.distance() == v2.distance() && v2.distance() == v3.distance()) {
			return "equilateral";
		} else if (v1.distance() == v2.distance() || v2.distance() == v3.distance()) {
			return "isoceles";
		} else {
			return "scalene";
		}
	}
}
