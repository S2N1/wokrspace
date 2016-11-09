package homeworkbookstore;

public class Book {

	private String name;
	private String author;
	private double price;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(String name, String author, double price, int quantity) {

		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;

	}

}
