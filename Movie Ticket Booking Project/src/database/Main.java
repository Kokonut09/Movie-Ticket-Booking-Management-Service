package database;

import java.sql.*;

/*
 * https://www.youtube.com/watch?v=KRhv4iPgzHE
 */

public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		createTable();
		
	}
	
	
	
	public static void createTable() throws Exception{
		try {
			
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(id in NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
						
		}catch (Exception e) {System.out.println(e);}
		finally{System.out.println("function complete.");}
		
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "javadata";
			String password = "mypass";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");		
			return conn;
			
		}catch(Exception e) {System.out.println(e);}
				
		return null;
	}

}
