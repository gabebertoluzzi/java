package composition;

public class NewBook {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public NewBook(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public NewBook(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book[name=" + name + ",Authors=" + authors + ",price=" + price + ",qty=" + qty + "]";
	}
	
	public String getAuthorNames() {
		for (int i = 0; i < authors.length; i++) {
			System.out.println((String)(authors[i].getName()));
		}
		return "Hello";
	}
	
	/*
	public String getMoreAuthorNames() {
		return authors[].getName();
	}
	*/
}
