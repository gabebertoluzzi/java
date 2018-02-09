package ntuOOP1;

public class TestSimpleCircle {

	public static void main(String[] args) {
		// test driver for Simple Circle class
		
		// Declare instance of SimpleCircle sc1
		// with first constructor
		SimpleCircle sc1 = new SimpleCircle();
		// second constructor
		SimpleCircle sc2 = new SimpleCircle(6.0);
		
		// Testing sc1
		System.out.println("The sc1 radius is " + sc1.getRadius());
		// Testing setter
		sc1.setRadius(12.0);
		System.out.println("The sc1 new radius is " + sc1.getRadius());
		// Getters
		System.out.println("sc1 area = " + sc1.getArea());
		System.out.println("sc1 circumference = " + sc1.getCircumference());
		
		
		// toString
		// implicit
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc1.toString());
	}

}
