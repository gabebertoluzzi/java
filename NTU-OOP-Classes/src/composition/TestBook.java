package composition;

public class TestBook {

	public static void main(String[] args) {
		Author gabeB = new Author("Gabe Bertoluzzi", "gabe.bertoluzzi@gmail.com", 'm');
		// test author toString
		System.out.println(gabeB);
		
		// Constructors
		// 1st
		Book bookOne = new Book("Terrain guides", gabeB, 24.99);		
		// 2nd
		Book bookTwo = new Book("space guides", gabeB, 38.99, 32);
		
		// toString tests
		System.out.println(bookOne);
		System.out.println(bookTwo);
		
		// Public methods
		System.out.println("Book name= " + bookOne.getName());
		System.out.println("Book name= " + bookTwo.getName());
		System.out.println("Author name= " + bookOne.getAuthor());
		System.out.println("price of bookOne= " + bookOne.getPrice());
		System.out.println("bookTwo qty= " + bookTwo.getQty());
		bookTwo.setQty(12);
		System.out.println("bookTwo new qty= " + bookTwo.getQty());
	
		// print author's email
		System.out.println(bookOne.getAuthor().getEmail());
		System.out.println("Author details: ");
		System.out.println("name: " + bookOne.getAuthorName());
		System.out.println("email: " + bookOne.getAuthorEmail());
		System.out.println("gender: " + bookOne.getAuthorGender());
	}

}
