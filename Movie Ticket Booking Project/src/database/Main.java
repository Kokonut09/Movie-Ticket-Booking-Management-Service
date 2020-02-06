package database;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * https://www.youtube.com/watch?v=KRhv4iPgzHE
 */

public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
		
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/database";
			String username = "hey";
			String password = "mypass";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");		
			return conn;
			
		}catch(Exception e) {System.out.println(e);}
		
		
		
		return null;
	}

}
