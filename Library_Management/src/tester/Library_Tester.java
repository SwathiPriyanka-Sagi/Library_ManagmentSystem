package tester;

import java.util.Scanner;

import Entities.Book;
import Entities.Library;
import Entities.Magazine;
import Entities.Member;


public class Library_Tester {

	public static void main(String[] args) {
		
		
		Library library = new Library();
        Scanner sc = new Scanner(System.in);

                while (true) {
                    System.out.println("Library Menu");
                    System.out.println("1. Add Book");
                    System.out.println("2. Remove Book");
                    System.out.println("3. Add Magazine");
                    System.out.println("4. Remove Magazine");
                    System.out.println("5. Register Member");
                    System.out.println("6. Display All Books");
                    System.out.println("7. Display All Members");
                    System.out.println("8. Issue Book");
                    System.out.println("9. Return Book");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice: ");

                    int menuChoice = sc.nextInt();
                    sc.nextLine();

                    switch (menuChoice) {
                        case 1:
                         
                            System.out.println(".............. Adding a Book ..............");
                            System.out.println("Enter Title : ");
                            String title = sc.nextLine();
                            System.out.println("Enter Author : ");
                            String author = sc.nextLine();
                            System.out.println("Enter Isbn : ");
                            String isbn = sc.nextLine();
                            System.out.println("Enter PublishedYear : ");
                            int publishedYear = sc.nextInt();
                            sc.nextLine();
                            Book book = new Book(title, author, isbn, publishedYear);
                            library.addBook(book);
                            System.out.println(".............................................");
                            break;

                        case 2:
                           
                            System.out.println(".............. Removing a Book ..............");
                            System.out.println("Enter Book Isbn to remove: ");
                            String bookIsbn = sc.nextLine();
                            boolean removed = false;
                            for (int i = 0; i < library.getBooks().size(); i++) {
                                Book removedBook = library.getBooks().get(i);
                                if (removedBook.getISBN().equals(bookIsbn)) {
                                    library.removeBook(removedBook);
                                    System.out.println(removedBook.getTitle() + " is removed");
                                    removed = true;
                                    break;
                                }
                            }
                            if (!removed) {
                                System.out.println("Book not found.");
                            }
                            System.out.println(".............................................");
                            break;

                        case 3:
                        System.out.println(".............. Adding a Magazine ..............");
                             System.out.println("Enter Title : ");
                             String magazineTitle = sc.nextLine();
                             System.out.println("Enter Author : ");
                             String magazineAuthor = sc.nextLine();
                             System.out.println("Enter Isbn : ");
                             String magazineIsbn = sc.nextLine();
                             System.out.println("Enter PublishedYear : ");
                             int magazinePublishedYear = sc.nextInt();
                             sc.nextLine();
                             System.out.println("Enter Issue Number : ");
                             String issueNumber = sc.nextLine();
                             Magazine magazine = new Magazine(magazineTitle, magazineAuthor, magazineIsbn, magazinePublishedYear, issueNumber);
                             library.addBook(magazine);
                             System.out.println(".............................................");
                             break;
                           
                        case 4:
                           
                            System.out.println(".............. Removing a Magazine ..............");
                            System.out.println("Enter Isbn to remove: ");
                            String magIsbnToRemove = sc.nextLine();
                            boolean magRemoved = false;
                            for (int i = 0; i < library.getBooks().size(); i++) {
                                if (library.getBooks().get(i).getISBN().equals(magIsbnToRemove)) {
                                    String magTitleToRemove = library.getBooks().get(i).getTitle();
                                    library.removeBook(library.getBooks().get(i));
                                    System.out.println(magTitleToRemove + " is removed");
                                    magRemoved = true;
                                    break;
                                }
                            }
                            if (!magRemoved) {
                                System.out.println("Magazine not found.");
                            }
                            System.out.println(".............................................");
                            break;

                        case 5:
                           
                            System.out.println(".............. Adding a Member ..............");
                            System.out.println("Enter name :");
                            String name = sc.nextLine();
                            System.out.println("Enter email :");
                            String email = sc.nextLine();
                            System.out.println("Enter phoneNum :");
                            long phone = sc.nextLong();
                            System.out.println("Enter MemberId :");
                            int id = sc.nextInt();
                            sc.nextLine();
                            Member member = new Member(name, email, phone, id);
                            library.addMember(member);
                            System.out.println(".............................................");
                            break;

                        case 6:
                         
                            System.out.println(".............. Printing All Books .............");
                            library.displayBooks();
                            System.out.println(".............................................");
                            break;

                        case 7:
                         
                            System.out.println(".............. Printing All Members .............");
                            library.displayMembers();
                            System.out.println(".............................................");
                            break;

                        case 8:
                       
                            System.out.println("..................... Issue Book .................");
                            System.out.println("Enter MemberId to issue Book: ");
                            int memberIdToIssue = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Book Isbn to issue Book: ");
                            String bookIsbnToIssue = sc.nextLine();
                            library.issueBook(memberIdToIssue, bookIsbnToIssue);
                            System.out.println(".............................................");
                            break;

                        case 9:
                     
                            System.out.println(".............. Return Book .............");
                            System.out.println("Enter MemberId to return Book: ");
                            int memberIdToReturn = sc.nextInt();
                            sc.nextLine(); 
                            System.out.println("Enter Book Isbn to return Book: ");
                            String bookIsbnToReturn = sc.nextLine();
                            library.returnBook(memberIdToReturn, bookIsbnToReturn);
                            System.out.println(".............................................");
                            break;

                        case 0:
                           
                            System.out.println("Exiting...");
                            sc.close();
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter a number between 0 and 9.");
                            break;
                    }
                }
}
}            

