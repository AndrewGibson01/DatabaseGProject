package myPackage;
import java.sql.*;
import java.util.*;

public class Products {
	int product_id; 
	String product_name, description, image_url;
	double price;
	public Products(int product_id2, String product_name2, 
			String description2, String image_url2, double price2) 
	{
		product_id = product_id2;
		product_name = product_name2; 
		description = description2; 
		image_url = image_url2;
		price = price2;
	}
	
	public static List<Products> getProducts(String keyword, Statement stmt) {
		String stmStr = String.format("select * from Products where product_name like '%s'", "%"+keyword+"%");
		List<Products> products = new ArrayList<Products>();
		try {
			ResultSet rs = stmt.executeQuery(stmStr);
			while (rs.next()) {
				
				products.add(
				new Products(rs.getInt("product_id"), 
				rs.getString("product_name"), rs.getString("description"),
				rs.getString("image_url"), rs.getDouble("price")
				
				));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return products;
	}
	
}
