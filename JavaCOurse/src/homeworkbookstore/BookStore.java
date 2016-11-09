package homeworkbookstore;

public class BookStore {

	private Book[] books;

	public BookStore(int maxNumberOfBooks) {
		books = new Book[maxNumberOfBooks];

	}

	public boolean addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				return true;
			}

		}
		return false;

	}

	public void printAllBooks() {
		for (Book book : books) {
			if (book != null) {
				System.out.println(book.getName() + "by" + book.getAuthor() + "for the price of " + book.getPrice());
			}

		}
	}

	public Book getBookByName(String name) {
		for (Book book : books) {
			if (book != null && book.getName().equalsIgnoreCase(name)) {
				return book;
			}

		}

		return null;

	}

	public boolean buy(Book book) {
		if (book.getQuantity() > 1) {
			book.setQuantity(-1);
		}

		return false;

	}

}
