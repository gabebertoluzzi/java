package composition;

import java.util.Arrays;

public class TestMyCircle {
	public static void main(String[] args) {
		// 1st constructor, default
		MyCircle c1 = new MyCircle();
		
		// 2nd constructor, given int values
		MyCircle c2 = new MyCircle(7, 8, 4);
		
		// 3rd constructor, given MyPoint and int radius
		MyPoint p1 = new MyPoint(10, 10);
		MyCircle c3 = new MyCircle(p1, 7);
		
		// toString testing
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c3);
		
		// Getter testing
		System.out.println("c1 radius: " + c1.getRadius());
		System.out.println("c2 center: " + c2.getCenter());
		System.out.println("c3 center x: " + c3.getCenterX()
				+ "c3 center y: " + c3.getCenterY());
		System.out.println("c1 center xy: " + c1.getCenterXY());
		System.out.println("c2 area: " + c2.getArea());
		System.out.println("c3 circumference: " + c3.getCircumference());
		
		
		// distance
		System.out.println("distance c1 vs c3 " + c3.distance(c2));
		
		
		
		
		System.out.println(Arrays.toString(c2.getCenterXY()));
		
		
		
	}

}
