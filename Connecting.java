package myPackage;
import java.sql.*;

public class Connecting {
	
	Connection con;
	PreparedStatement pst;
	Statement stmt;
	
	public void Connecty() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url
	            = "jdbc:mysql://localhost:6969/EShop"; // table details
	        String username = "Herobrine"; // MySQL credentials
	        String password = "poop";
			
			con = DriverManager.getConnection(
		            url, username, password);
			System.out.println("Connection created");
			
			stmt = con.createStatement();
			
			/*
			String createTable = "CREATE TABLE Employee( "
			         + "Name VARCHAR(255), "
			         + "Salary INT NOT NULL, "
			         + "Location VARCHAR(255))";
			
			String createTable2 = "select * from Employee";
			
			boolean bool = stmt.execute(createTable);
			bool = stmt.execute(createTable2);
			//executeQuery("select * from Users;");
			System.out.println(bool);
			 */
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
	}

}
