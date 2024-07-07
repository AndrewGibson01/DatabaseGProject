package myPackage;
import java.sql.*;
import java.util.*;

public class Users {
	int user_id; 
	String username, password, email, first_name, last_name, address;
	public Users(int user_id2, String username2, String password2,
			String email2, String first_name2, String last_name2,
			String address2) 
	{
		user_id = user_id2; 
		username = username2;
		password = password2;
		email = email2; 
		first_name = first_name2; 
		last_name = last_name2;
		address = address2;
	}
	
	public static List<Users> getUsers(String keyword, Statement stmt) {
		String stmStr = String.format("select * from Users where user_id like '%s'", "%"+keyword+"%");
		List<Users> users = new ArrayList<Users>();
		try {
			ResultSet rs = stmt.executeQuery(stmStr);
			while (rs.next()) {
				
				users.add(
				new Users(rs.getInt("user_id"), 
				rs.getString("username"), rs.getString("password"),
				rs.getString("email"), rs.getString("first_name"),
				rs.getString("last_name"), rs.getString("address")
				
				));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return users;
	}
	
}
