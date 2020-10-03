/**
 * 
 */
package Random.coder.service;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;


import java.util.*;

import Random.coder.dao.dbOperations;
import Random.coder.util.database;
import Random.coder.bean.*;
import java.awt.Panel;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLayeredPane;
import java.awt.Font;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class gui  {

	public JFrame frame;
	public JTextField textField;
	public JPasswordField passwordField;
	JButton btnNewButton_2;
	static JTextField user;
	static JPasswordField pass; 
	ImageIcon image;
	/**
	 * 
	 */
	
	public JTextField user()
	{
		user=textField;
		return user;
	}
	public JTextField pass()
	{
		pass=passwordField;
		return pass;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.setBounds(100, 100, 457, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 72, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 125, 116, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setBounds(28, 74, 99, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBounds(28, 125, 84, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(40, 184, 87, 25);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("");
				passwordField.setText("");
			}
		});
	
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(137, 184, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e)	
		  {   //database.getDBConnect();
			  dbOperations db=new dbOperations();
			  ArrayList <userDB_bean> user=db.retrive();
			  
			 // Iterator <userDB_bean> i=user.iterator();
		      //  userDB_bean temp=i.next();
			  int x=0;
			  for(userDB_bean obj:user)
			  {
				 /* System.out.println("username "+obj.getUsername());
				  System.out.println("password "+obj.getPassword());
				  */
				  if(obj.getUsername().equals(textField.getText()))
				  {
					  if(obj.getPassword().equals(passwordField.getText()))
					  {  String info=String.format(" logged in as %s",obj.getUsername());
					      user();
					      pass();
						  JOptionPane.showMessageDialog(textField,info);
						  x=1;
						  break;
					  }
					  
				  }
				  
			  }
			  if(x==0)
			  {  JOptionPane.showMessageDialog(textField,"Invaild  Username & password");
				  
			  }
			  else{
			 /* btnNewButton_1.setVisible(false);
			  btnNewButton.setVisible(false);
			  btnNewButton_2.setVisible(false);
			  textField.setVisible(false);;
				 passwordField.setVisible(false);
				 lblNewLabel.setVisible(false);
				 lblNewLabel_1.setVisible(false); */
				  Secondframe sf=new Secondframe();
				  frame.dispose();
				  sf.setVisible(true);
			  }
				 
		  }
		});
		
		 btnNewButton_2 = new JButton("Cancel");
		 btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(137, 222, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		Panel panel = new Panel();
		panel.setForeground(Color.CYAN);
		panel.setBounds(28, 245, 400, 152);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.DARK_GRAY);
		layeredPane.setForeground(Color.DARK_GRAY);
		panel.add(layeredPane, "name_191589177895300");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(95, 158, 160));
		lblNewLabel_2.setLabelFor(lblNewLabel_2); 
		//lblNewLabel_2.setIcon(new ImageIcon("Images\\blog-wp-login_2_400x152.png")); this line does not load image in jar files
	    //  image=new ImageIcon(getClass().getClassLoader().getResource("blog-wp-login_2_400x152.png"));
	     // lblNewLabel_2.setIcon(image); or use single line
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("blog-wp-login_2_400x152.png")));
		lblNewLabel_2.setBounds(0, 13, 400, 139);
		layeredPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("Sign Up");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{  
			 if(passwordField.getText().length()<8)
			{
				JOptionPane.showMessageDialog(passwordField,"Password must be Atleast 8 Letter's");
			}
			else{
				dbOperations db=new dbOperations();
				int up=db.InsertedValue(textField.getText(),passwordField.getText());
				if(up>=0)
				{
					JOptionPane.showMessageDialog(passwordField,"Signed UP");
					Secondframe sf=new Secondframe();
					frame.dispose();
					sf.setVisible(true);
				}
			}
			}
		});
		btnNewButton_3.setBounds(243, 184, 97, 25);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
             //System.out.println("cancel");
				frame.dispose();	
			}
			
		});
	}
	
}
