package myPackage;
import java.sql.*;

public class Connecting {
	
	Connection con;
	PreparedStatement pst;
	static Statement stmt;
	
	boolean isGood = false; 
	
	public void Connecty(String port, String user, String pass) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			/*
			String url
	            = "jdbc:mysql://localhost:6969/EShop"; // table details
	        String username = "Herobrine"; // MySQL credentials
	        String password = "poop";
			*/
			
			String url
            = "jdbc:mysql://localhost:" + port + "/EShop"; // table details
			
			con = DriverManager.getConnection(
		            url, user, pass);
			
			
			stmt = con.createStatement();
			
			System.out.println("Connection created ");
			
			isGood = true;
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
				isGood = false;
				System.out.println(e.getMessage());
			}	
	}

}
