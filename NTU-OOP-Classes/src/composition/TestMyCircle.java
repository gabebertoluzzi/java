package composition;

public class TestMyCircle {
	public static void main(String[] args) {
		MyCircle c2 = new MyCircle(7, 8, 4);
	
		System.out.println(c2);
		
		System.out.println(c2.getCenterXY());
	}

}
