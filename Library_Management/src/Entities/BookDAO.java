package Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
	
	
	public void insertBook(String title, String isbn, String author, String publishedYear) throws SQLException {
		 
		String query = "INSERT INTO Books values ('" +title+ "' , '" +isbn+ "' , '" +author + "' , '" +publishedYear+ "')";
		System.out.println(query);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagment","root","Priya@123");
		
		Statement stmt = con.createStatement();
		
		int rowsAffected = stmt.executeUpdate(query);
		
		if(rowsAffected == 1) {
			System.out.println("Query Ok, "+rowsAffected+ "row affected.");
		
		} else {
			
			System.out.println("Query Ok, "+rowsAffected+ "rows affected.");
		}
		
	}
	
	public void readBook(String isbn) throws SQLException {
		ResultSet rs = null;
		Connection con  = null;
		Statement stmt = null;
		String query = "SELECT * FROM Books";
		System.out.println(query);
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trx_03","root","Priya@123");
			stmt = con.createStatement();
			rs  = stmt.executeQuery(query);
			System.out.println("+-------+----------+----------+");
			System.out.printf("|%s | %-10s | \n", "title" , "PusblishedYear");
			System.out.println("+-------+----------+----------+");
		while(rs.next()) {
			System.out.printf("|%6s | %-10s |\n", rs.getString("title"), rs.getString("PublishedYear"));
			System.out.println("+-------+-----------+----------+");
		}
		}
		 
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException ex) {
			System.out.println("Exception while closing connections");
		}
	}
	}
	
	public void updateBook(String publishedYear, String title) throws SQLException {
		String query = "Update Books SET publishedYear = '"+publishedYear+"' WHERE title = '" +title+ "'" ;
		System.out.println(query);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagment","root","Priya@123");
			
				Statement stmt = con.createStatement();
				int rowsAffected = stmt.executeUpdate(query);
				if(rowsAffected == 1) {
					System.out.println("Query Ok, "+rowsAffected+ "row affected.");
			
				} else {
					
					System.out.println("Query Ok, "+rowsAffected+ "rows affected.");
			}
	}
	
	public void deleteBook(String title) throws SQLException {
			String query = "DELETE FROM Books WHERE title = '"+title+ "'";
			System.out.println(query);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagment","root","Priya@123");
			Statement stmt = con.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
			
			if(rowsAffected == 1) {
				System.out.println("Query Ok, "+rowsAffected+ "row affected.");
		
				} else {
			
					System.out.println("Query Ok, "+rowsAffected+ "rows affected.");
				}
		
	}

}
