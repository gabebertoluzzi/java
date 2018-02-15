package composition;

import java.util.Arrays;

public class TestMyCircle {
	public static void main(String[] args) {
		// 1st constructor, default
		MyCircle c1 = new MyCircle();
		// 2nd constructor, given int values
		MyCircle c2 = new MyCircle(7, 8, 4);
		// 3rd constructor, given MyPoint and int radius
		MyPoint p1 = new MyPoint();
		MyCircle c3 = new MyCircle(p1, 7);
		
		System.out.println(c2);
		
		System.out.println(Arrays.toString(c2.getCenterXY()));
		
		
		
	}

}
