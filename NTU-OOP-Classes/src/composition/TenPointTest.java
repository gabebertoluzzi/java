package composition;

public class TenPointTest {

	public static void main(String[] args) {
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < points.length; i++) {
			points[i] = new MyPoint(i+1, i+1);
		}
		
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}

	}

}
