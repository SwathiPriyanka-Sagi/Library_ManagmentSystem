package Entities;

public class Librarian extends Person{
	
	private int employeeID;
	private Library library;

	public Librarian () {
		
	}
	
	

	public Librarian(String name, String email, long phoneNo, int employeeID, Library library) {
		super(name, email, phoneNo);
		this.employeeID = employeeID;
		this.library = library;
	}



	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public void manageBooks(Book book, String action) {
		if(action.equals("add"))

		{

			library.addBook(book);

		}

		else if(action.equals("remove"))

		{

			library.removeBook(book);

		}
	}
	public void registerMember(Member anothermember) {
		library.addMember(anothermember);
		
	}
	
	@Override
	public String toString() {
		return "Librarian [employeeID=" + employeeID + ", library=" + library + "]";
	}



	public void displayInfo() {
		 System.out.println("Employee ID :" + employeeID);

	      System.out.println("Name :" + getName());

	      System.out.println("Email :" + getEmail());

	      System.out.println("Phone Number :" + getPhoneNo());
		
	}
	
	

}
