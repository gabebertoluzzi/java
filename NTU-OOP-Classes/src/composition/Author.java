package composition;

public class Author {
	// private variables
	private String name;
	private String email;
	private char gender;
	
	// Constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	// public methods
	// Getter for name -variable
	public String getName() {
		return this.name;
	}
	
	// Getter for -email
	public String getEmail() {
		return this.email;
	}
	
	// Setter for email
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getter for -gender
	public char getGender() {
		return this.gender;
	}
	
	// toString
	public String toString() {
		return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
	}
	
}
