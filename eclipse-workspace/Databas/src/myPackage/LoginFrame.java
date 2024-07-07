package myPackage;

import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame
implements ActionListener {

	public Container c;
	public JLabel title;
	
	public JLabel label1;
	public JLabel label2;
	public JLabel label3;
	public JTextField textField1 = new JTextField();
	public JTextField textField2 = new JTextField();
	public JPasswordField textField3 = new JPasswordField();
	
	public Button button1;
	
	public LoginFrame() {
		setTitle("Connect to Database");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        c = getContentPane();
        c.setLayout(null);
		
		title = new JLabel("Connect to Database");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        
        label1 = new JLabel("Port:");
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setSize(500, 40);
        label1.setLocation(150, 100);
        c.add(label1);
        
        textField1.setFont(new Font("Arial", Font.PLAIN, 30));
        textField1.setSize(500, 40);
        textField1.setLocation(200, 100);
        c.add(textField1);
        
        label2 = new JLabel("Username:");
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        label2.setSize(500, 40);
        label2.setLocation(95, 150);
        c.add(label2);
        
        textField2.setFont(new Font("Arial", Font.PLAIN, 30));
        textField2.setSize(500, 40);
        textField2.setLocation(200, 150);
        c.add(textField2);
        
        label3 = new JLabel("Password:");
        label3.setFont(new Font("Arial", Font.PLAIN, 20));
        label3.setSize(500, 40);
        label3.setLocation(100, 200);
        c.add(label3);
        
        textField3.setFont(new Font("Arial", Font.PLAIN, 30));
        textField3.setSize(500, 40);
        textField3.setLocation(200, 200);
        textField3.setEchoChar('*');
        c.add(textField3);
        
        button1 = new Button("Connect");
        c.add(button1);
        button1.setSize(300, 30);
        button1.setLocation(300, 250);

        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	HelloWorld.button2(textField1.getText(), textField2.getText()
            			, textField3.getText());
            }
        }); 
        
        setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void destroy() {
		setVisible(false);
		dispose();
	}

}
