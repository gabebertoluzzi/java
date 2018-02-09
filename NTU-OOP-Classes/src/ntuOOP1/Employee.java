package ntuOOP1;

public class Employee {
	// private variables
	private int id;
	private String firstName;
	private String lastName;
	private int salary;		// monthly salary
	
	// 1st (only) constructor.  All values given.
	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	// Public Methods
	// Getter for ID
	public int getID() {
		return this.id;
	}
	
	// Getter for first name
	public String getFirstName() {
		return this.firstName;
	}
	// Getter for last name
	public String getLastName() {
		return this.lastName;
	}
	// Getter for full name
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	// Getter for monthly salary
	public int getSalary() {
		return this.salary;
	}
	// Setter for monthly salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// Getter for Annual salary
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	// Raise salary a percentage (setter?)
	public int raiseSalary(int percent) {
		//(double)(percent) = (double)(percent) / 100;
		//return this.salary += (int)(this.salary * percent);
		//return (this.salary * percent);
        this.salary = (int) (this.salary + (this.salary * ((double)(percent) / 100)));
        return this.salary;
	}
	// toString
	public String toString() {
		return "Employee[id=" + this.id + ",name=" + this.firstName + " " + this.lastName + ",salary=" + this.salary + "]";
	}
	
}
