package Entities;

public class Book implements Comparable<Book>{
	
	private String title;
	private String ISBN;
	private String author;
	private int publishedYear;
	
	public Book() {
		
	}
	public Book(String title, String isbn, String author, int publishedYear) {
		super();
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
		this.publishedYear = publishedYear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setIsbn(String ISBN) {
		this.ISBN = ISBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", ISBN=" + ISBN + ", author=" + author + ", publishedYear=" + publishedYear + "]";
	}
	public void displayDetails() {
		System.out.println("Book [title=" + title + ", ISBN=" + ISBN + ", author=" + author + ", publishedYear=" + publishedYear+ "]");
	}
	
	
	public int compareTo(Book anotherBook) {
		return this.ISBN.compareTo(anotherBook.ISBN);
	}
	
}
