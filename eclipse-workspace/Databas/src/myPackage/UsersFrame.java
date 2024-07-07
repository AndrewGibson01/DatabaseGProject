package myPackage;

import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsersFrame extends JFrame
implements ActionListener {

	public Container c;
	public JLabel title;
	public JLabel label1;
	public JTextArea textArea;
	public Button button1;
	public Button button2;
	public JScrollPane scrPane;
	public JTextField textField = new JTextField();
	
	public UsersFrame() {
		setTitle("Add Users");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        c = getContentPane();
        c.setLayout(null);
		
		title = new JLabel("Add Users");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(375, 30);
        c.add(title);
        
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        textField.setSize(500, 40);
        textField.setLocation(200, 100);
        c.add(textField);
        
        label1 = new JLabel("Keyword:");
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setSize(500, 40);
        label1.setLocation(100, 100);
        c.add(label1);
        
        button1 = new Button("Search");
        c.add(button1);
        button1.setSize(300, 30);
        button1.setLocation(300, 200);

        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	HelloWorld.button1(textField.getText());
            }
        });  
        
        button2 = new Button("Back");
        c.add(button2);
        button2.setSize(100, 30);
        button2.setLocation(10, 10);

        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	HelloWorld.button4(1);
            }
        });  
        
        scrPane = new JScrollPane();
        scrPane.setSize(600, 300);
        scrPane.setLocation(150, 250);
        scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
             
        
        textArea = new JTextArea(600, 300);
        //textArea.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 15));
        
        scrPane.getViewport().add(textArea);
        c.add(scrPane);
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
