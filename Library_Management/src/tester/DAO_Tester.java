package tester;

import java.sql.SQLException;

import Entities.BookDAO;

public class DAO_Tester {

	public static void main(String[] args)throws SQLException {
		
		BookDAO bd = new BookDAO();
    	bd.insertBook("lifeCycle" , "ASDYU1234", "Robert", "2019");
		bd.readBook("1234567");
		bd.updateBook("1356", "Pushpa");
		bd.deleteBook("lifeCycle");
	}
	

}
