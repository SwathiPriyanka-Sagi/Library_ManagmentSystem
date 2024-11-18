package Entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books;
	private List<Magazine> magazines;
	private List<Member> members;
	
	public Library() {
		books = new ArrayList<Book>();
		magazines = new ArrayList<Magazine>();
		members = new ArrayList<Member>();	
	}

	public List<Book> getBooks() {
		return books;
	}
	public List<Magazine> getMagazines() {
		return magazines;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	public void removeMembers() {
		members.remove(members);
	}
	public void addMagazine(Magazine magazine) {
		magazines.add(magazine);
	}
	
	public void removeMagazine(Magazine magazine) {
		magazines.remove(magazine);
	}
	

	public void issueBook(int id, String isbn)
	{
		if(books.isEmpty())
		{
			System.out.println("No Books Available for issuing.");
		}
		Member member = null;
		int i = 0;
	for (i = 0; i < members.size(); i++) {
		if (members.get(i).getMemberID() == id) {
			member = members.get(i);
			break;
	}
	}
	if (i == members.size()) {
		System.out.println("Member not found.");
		System.out.println("Issue failed.");
		return;
	}

	int j = 0;
	for (j = 0; j < books.size(); j++) {
		Book borrowedBook = books.get(j);
		if (borrowedBook.getISBN().equals(isbn)) {
			member.borrowBook(borrowedBook);
			books.remove(borrowedBook);
			System.out.println(borrowedBook.getTitle() + " book has been issued to " + member.getName()
			+ " and removed from library.");
			break;
		}
	}

}

	public void returnBook(int id, String isbn)
	{
	
		Member member = null;
	
		int i = 0;
	for (i = 0; i < members.size(); i++) {
		if (members.get(i).getMemberID() == id) {
			member = members.get(i);
			break;
		}
	}
		if (i == members.size()) {
			System.out.println("Member not found.");
			System.out.println("Issue failed.");
			return;
	}
	for (int j = 0; j < member.getBorrowBooks().size(); j++) {
		Book returnedBook = member.getBorrowBooks().get(j);
	if (returnedBook.getISBN().equals(isbn)) {
		member.returnBook(returnedBook);
		books.add(returnedBook);
		System.out.println(returnedBook.getTitle() + " book has been returned by " + member.getName()
		+ " and added to the library ");
		break;
	}
	}
	if(member.getBorrowBooks().isEmpty())
	{
		System.out.println("No books to return");
	}

}

	public void issueBook(Member member, Book book) {
		for (int i = 0; i < members.size() - 1; i++) {
			if (members.get(i).getMemberID() == member.getMemberID()) {
				member.borrowBook(book);
				removeBook(book);
				break;
			}
		}
	}

	public void returnBook(Member member, Book book) {
		for (int i = 0; i < members.size() - 1; i++) {
			if (members.get(i).getMemberID() == member.getMemberID()) {
				member.returnBook(book);
				addBook(book);
				break;
			}
		}
	}

	public void displayBooks() {
		for (int i = 0; i < books.size(); i++) {
			books.get(i).displayDetails();
			System.out.println(books);
		}

		System.out.println("Books size: " + books.size());
	}

	public void displayMembers() {
		for (int i = 0; i < members.size(); i++) {
			members.get(i).displayInfo();
			System.out.println(members);
		}
	}

}

