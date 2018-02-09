package composition;

public class Book {
	// private variables
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	// 1st constructor, without qty
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = 0;
	}
	
	// 2nd constructor with qty
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	// public methods
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Getter for Author
	public Author getAuthor() {
		return this.author;
	}
	
	// Getter for price
	public double getPrice() {
		return this.price;
	}
	
	// Setter for price
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Getter for qty
	public int getQty() {
		return this.qty;
	}
	
	// Setter for qty
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	// Getter for author name
	public String getAuthorName() {
		return author.getName();
	}
	
	// Getter for author email
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	// Getter for author gender
	public char getAuthorGender() {
		return author.getGender();
	}
	
	// toString
	public String toString() {
		return "Book[name=" + name + ",Author=" + author + ",price=" + price + ",qty=" + qty + "]";
	}
	
}
