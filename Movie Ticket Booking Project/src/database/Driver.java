package database;

import java.sql.*;

public class Driver {
	
	public static void main(String[] args){
		
		try {
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store", "javadata", "mypass" );
			
			
			Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM customers ");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));;
				
			}
			
		}catch (Exception e){
			
			e.printStackTrace();
		}
		
	}
	
}
