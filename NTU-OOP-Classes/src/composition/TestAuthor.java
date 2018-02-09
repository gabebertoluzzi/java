package composition;

public class TestAuthor {

	public static void main(String[] args) {
		// Test constructor
		Author gabeB = new Author("Gabe Bertoluzzi", "gabe.bertoluzzi@gmail.com", 'm');
		// test toString
		System.out.println(gabeB);
		
		// Test setter
		gabeB.setEmail("elzi.gabe@gmail.com");
		
		// Test name Getter
		System.out.println("The name is " + gabeB.getName());
		// Test email Getter
		System.out.println("The email is " + gabeB.getEmail());
		// Test gender getter
		System.out.println("The gender is " + gabeB.getGender());

	}

}
