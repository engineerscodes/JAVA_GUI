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
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class gui  {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
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
		frame.setBounds(100, 100, 456, 454);
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
		lblNewLabel.setBounds(28, 74, 99, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(28, 125, 84, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Reset");
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
			  btnNewButton_1.setVisible(false);
			  btnNewButton.setVisible(false);
			  btnNewButton_2.setVisible(false);
			  textField.setVisible(false);;
				 passwordField.setVisible(false);
				 lblNewLabel.setVisible(false);
				 lblNewLabel_1.setVisible(false); 
			  }
				 
		  }
		});
		
		 btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setBounds(244, 184, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
             //System.out.println("cancel");
				frame.dispose();	
			}
			
		});
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */


}
