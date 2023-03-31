package lab6;
public class Book {
	private String Title;
	private String Author;
	 private int numOfCopies;

	public Book(String Title, String Author, int numOfCopies) {
		super();
		this.Title =Title;
		this.Author = Author;
		this.numOfCopies=numOfCopies;
	}
	public  String getTitle() {
		return Title;
	}
	public  String getAuthor() {
		return Author;
	}
	public  int getnumOfCopies() {
		return numOfCopies;
	}
	public void increaseCopies(int Copies) {
		  numOfCopies += Copies;
	}
	public void decreaseCopies(int copies) {
		if(copies<= numOfCopies)
			numOfCopies -= copies;
		else
			System.out.println("Not enough copies.");
	}
	@Override
	public String toString() {
		return "Book [title=" + Title + ", author=" + Author + ", noOfCopies=" + numOfCopies + "]";
	}
		public void display(){
	      System.out.println(this);
		   }
}