package composition;

public class TestMyTriangle {
	public static void main(String[] args) {
		// 1st constructor, given x/y values
		MyTriangle t1 = new MyTriangle(1,2,2,3,3,4);
		
		// 2nd constructor, requires points
		MyPoint p1 = new MyPoint(10,20);
		MyPoint p2 = new MyPoint(20, 30);
		MyPoint p3 = new MyPoint(30, 80);
		MyTriangle t2 = new MyTriangle(p1, p2, p3);
		
		// toString tests
		// implicit
		System.out.println(t1);
		// explicit
		System.out.println(t2.toString());
		
		// getPerimeter
		System.out.println("Perimeter t1: " + t1.getPerimeter());
		System.out.println("Permieter t2: " + t2.getPerimeter());
		
		// Triangle type
		System.out.println("Type t1: " + t1.getType());
		System.out.println("Type t2: " + t2.getType());
	}
}
