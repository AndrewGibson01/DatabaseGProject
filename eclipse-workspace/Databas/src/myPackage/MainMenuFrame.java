package myPackage;

import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenuFrame extends JFrame
implements ActionListener {

	public Container c;
	public JLabel title;
	
	
	public Button button1;
	public Button button2;

	
	public MainMenuFrame() {
		setTitle("Main Menu");
        setBounds(300, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        c = getContentPane();
        c.setLayout(null);
		
		title = new JLabel("Main Menu");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(235, 30);
        c.add(title);
        
        button1 = new Button("Product Search");
        c.add(button1);
        button1.setSize(300, 60);
        button1.setLocation(150, 100);

        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	HelloWorld.button3(0);            }
        }); 
        
        button2 = new Button("Add Users");
        //c.add(button2);
        button2.setSize(300, 60);
        button2.setLocation(150, 200);

        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	HelloWorld.button3(1);            }
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
