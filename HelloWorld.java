/**
 * 
 */
package myPackage;
import java.sql.*;

import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

import com.mysql.cj.jdbc.Driver;

/**
 * @author Andrew
 *
 */

public class HelloWorld {
	/**
	 * @param args
	 * @throws SQLException 
	 */
	
	static java.util.List<Products> products;
	static Connecting con;
	static MyFrame f;
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		/*
		System.out.print("What is the port? ");
		String port = reader.next();
		
		System.out.print("What is the Username (for mysql)? ");
		String username = reader.next();
		
		System.out.print("What is the Password (for mysql)? ");
		String password = reader.next();
		System.out.println(port);
		*/
		f = new MyFrame();
		
		
		
		con = new Connecting();
		con.Connecty();
		/*
		products = Products.getProducts("", con.stmt);
		System.out.println(products.get(0).product_name);
		
		
		String productLabel = "";
		for (int i = 0; i < products.size(); i++) {
			Products currProduct = products.get(i);
			productLabel += currProduct.product_name + " $" + currProduct.price
					+ "\n" + currProduct.description + "\n\n";
		}
		f.textArea.setText(productLabel);
		*/
	}
	public static void button1(String theText) {
		products = Products.getProducts(theText, con.stmt);
		//System.out.println(products.get(0).product_name);
		
		
		String productLabel = "";
		
		int prodSize = products.size();
		if (prodSize == 0) {
			productLabel = "Sorry nothing was found with that keyword";
		} else {
			for (int i = 0; i < products.size(); i++) {
				Products currProduct = products.get(i);
				productLabel += currProduct.product_name + " $" + currProduct.price
						+ "\n" + currProduct.description + "\n\n";
			}
		}
		f.textArea.setText(productLabel);
	}
	

}
