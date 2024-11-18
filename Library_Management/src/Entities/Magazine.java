package Entities;

public class Magazine extends Book {
	
	private String magazineIssueNum;
	

	public Magazine() {
		
	}


	public Magazine(String magazineTitle, String magazineAuthor, String magazineIsbn, int magazinePublishedYear,
			 String magazineIssueNum) {
		super();
		this.magazineIssueNum = magazineIssueNum;
		
	}

	public String getmagazineIssueNum() {
		return magazineIssueNum;
	}

	public void setmagazineIssueNum(String magazineIssueNum) {
		this.magazineIssueNum = magazineIssueNum;
	}
	public void addMagazine(String magazineIssueNum) {
		this.magazineIssueNum = magazineIssueNum;
	}
	
	
	@Override
	public String toString() {
		return "Magazine [magazineIssueNum=" + magazineIssueNum + "]";
	}


	public void removeMagazine(int magazineIssueNum) {
		
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println(magazineIssueNum);
		
	}

	
	
	

}
