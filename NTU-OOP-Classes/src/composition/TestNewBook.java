package composition;

public class TestNewBook {
	
	public static void main(String[] args) {
		Author[] a3 = new Author[3];
		a3[0] = new Author("John Doe", "johndoe@doemail.com", 'm');
		a3[1] = new Author("John Smith", "jsmith@email.com", 'm');
		a3[2] = new Author("Jack Black", "jblack@email.com", 'm');
		
		NewBook nB1 = new NewBook("Working with Java Classes", a3, 3.99);
		System.out.println(nB1);
		
		nB1.getAuthorNames();
	}

}
