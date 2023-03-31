package lab6;
import java.util.ArrayList;
public class BookStore {
	String name;
	ArrayList<Book> books = new ArrayList<>();
	public BookStore(String name) {
		super();
		this.name = name;
	}
	public Book findBook(String title, String author) {
		for(int i=0; i<books.size(); i++) {
			Book b = books.get(i);
			// Check if the title and the author name matches
		if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
							return b;
						}
//		if(books[i].title.equals(title) && books[i].author.equals(author))
//							return books[i];
				}
					return null;
	}
	/***
	 * 
	 * @param title
	 * @param author
	 * @param quantity
	 */
	// if you want to sell book ,at 1st you take input with title,author & quantity;
	public void sell(String title, String author, int quantity) {
		Book b = findBook(title, author);
		if(b==null)
			System.out.println("Book not available");
		else
			b.decreaseCopies(quantity);
	}
	//if you want to order book ,at 1st you take input with title,author & quantity;
	public void order(String title, String author, int quantity) {
		Book b = findBook(title, author);
		if(b==null) {
			System.out.println("Book not available");
			books.add(new Book(title, author, quantity));
		}
		else
			b.increaseCopies(quantity);
		
	}
	//display method which is name of your Bookstore name;
	public void display() {
		System.out.println("-----------"+name+"--------------");
		if(books.size() == 0) {
			System.out.println("No books avaiable");
		}
		else {
			for(Book b: books)
				System.out.println(b);
		}
	}

}