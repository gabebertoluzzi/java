package ntuOOP1;

public class TestEmployee {

	public static void main(String[] args) {
		// Declare instance e1 of Employee class
		Employee e1 = new Employee(1234, "Gabe", "Bertoluzzi", 5000);
		// invoke public methods in e1
		System.out.println("e1 id: " + e1.getID());
		System.out.println("e1 first name: " + e1.getFirstName());
		System.out.println("e1 last name: " + e1.getLastName());
		System.out.println("e1 full name: " + e1.getName());
		System.out.println("e1 salary: " + e1.getSalary());
		System.out.println("e1 annual salary: " + e1.getAnnualSalary());
		System.out.println("raised salary " + e1.raiseSalary(50));
		
		
		System.out.println(50 / 100);
		
	}

}
