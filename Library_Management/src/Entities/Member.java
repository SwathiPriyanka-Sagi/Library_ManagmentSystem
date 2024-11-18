package Entities;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person implements Comparable<Member>{
	private int memberID;
	List<Book> borrowBooks = new ArrayList<Book>();
	//ArrayList<Member> members = new ArrayList <Member>();

	
	public Member() {
		
	}
	
	public Member(String name, String email, long phoneNo, int memberID) {
		super(name, email, phoneNo);
		this.memberID = memberID;
		this.borrowBooks = borrowBooks;
	}


	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	public List<Book> getBorrowBooks() {
		return borrowBooks;
	}

	
	

	public void borrowBook(Book book) {
		borrowBooks.add(book);
	}

	public void returnBook(Book book) {
		borrowBooks.remove(book);
	}
	
	public int booksLimit() {
		return 0;
	}

	public int compareTo(Member anotherMember) {
		if(this.memberID < anotherMember.memberID) {
			return -1;
		} if(this.memberID > anotherMember.memberID) {
			return 1;
		}
		return 0;
	}
	

	
	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", borrowBooks=" + borrowBooks + "]";
	}

	public void displayInfo() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNo);
		System.out.println(memberID);
	}

	

	
}
