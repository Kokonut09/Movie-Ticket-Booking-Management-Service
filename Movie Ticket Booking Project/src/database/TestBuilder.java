package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.Driver;

public class TestBuilder {

	public static void main(String[] args) {
		getName();

	}
	
	
	public static void getName() {

		try {

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store", "javadata", "mypass" );

			Statement myStmt = myConn.createStatement();
			
		
			ResultSet myRs = myStmt.executeQuery("CREATE TABLE IF NOT EXISTS CurrentMovies(title VARCHAR(20), Rating VARCHAR(5), Runtime SMALLINT, Synopsis TEXT(2000)");



			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));

			}

		}catch (Exception e){

			e.printStackTrace();
		}
		
	}
}
