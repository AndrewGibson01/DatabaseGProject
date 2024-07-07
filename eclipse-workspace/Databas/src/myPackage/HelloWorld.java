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
	static ProductSearchFrame productSearchFrame;
	static LoginFrame loginFrame;
	static MainMenuFrame mainMenu;
	static UsersFrame usersFrame;
	
	public static void main(String[] args) 
	{
		//Scanner reader = new Scanner(System.in);
		
		//mainMenu = new MainMenuFrame();
		loginFrame = new LoginFrame();
		
		/*
		System.out.print("What is the port? ");
		String port = reader.next();
		
		System.out.print("What is the Username (for mysql)? ");
		String username = reader.next();
		
		System.out.print("What is the Password (for mysql)? ");
		String password = reader.next();
		System.out.println(port);
		*/
		
		
		
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
		productSearchFrame.textArea.setText(productLabel);
	}
	public static void button2(String port, String user, String pass) { 
		con = new Connecting();
		if (port.equals("d") || port.equals("def")) {
			con.Connecty("6969", "Herobrine", "poop");
		} else {
			con.Connecty(port, user, pass);
		}
		loginFrame.destroy();
		if (con.isGood) {
			mainMenu = new MainMenuFrame();
			//productSearchFrame = new ProductSearchFrame();
		} else {
			loginFrame = new LoginFrame();
		}
	}

	public static void button3(int mode) { 
		con = new Connecting();
		
		mainMenu.destroy();
		if (mode == 0) {
			productSearchFrame = new ProductSearchFrame();
		} else {
			usersFrame = new UsersFrame();
		}
	}

	public static void button4(int mode) { 
		con = new Connecting();
		
		if (mode == 0) {
			productSearchFrame.destroy();
		} else {
			usersFrame.destroy();
		}
		mainMenu = new MainMenuFrame();
		
	}
}
