/**
 * 
 */
package swingGui;
import java.sql.*; 
import java.awt.event.*;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
//import com.mysql.*;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class login_system implements ActionListener{

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;
    private JButton btnNewButton ;
    private JLabel lblNewLabel;
    private 	JLabel lblPassword;
    private JButton btnNewButton_1;
    private JButton btnCanel;
    private JLabel label ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_system window = new login_system();
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
	public login_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(136, 51, 116, 22);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("password");
		passwordField.setBounds(136, 86, 116, 22);
		frame.getContentPane().add(passwordField);
		
		 btnNewButton = new JButton("Login");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\git\\JAVA_GUI\\Swing\\src\\images\\download_1_161x41.png"));
		btnNewButton.setBounds(199, 150, 96, 31);
		 btnNewButton.addActionListener(this); 
		frame.getContentPane().add(btnNewButton);
		
		 lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 54, 84, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblPassword.setBounds(38, 89, 84, 16);
		frame.getContentPane().add(lblPassword);
		
		 btnNewButton_1 = new JButton("Reset");
		 btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\HP\\git\\JAVA_GUI\\Swing\\src\\images\\RESETlogo_84x31.jpg"));
		btnNewButton_1.setBounds(122, 150, 74, 31);
		btnNewButton_1.addActionListener(this);
		frame.getContentPane().add(btnNewButton_1);
		
		btnCanel = new JButton("Cancel");
		btnCanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{ // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
				frame.dispose();
			}
		});
		btnCanel.setBounds(155, 204, 97, 25);
		frame.getContentPane().add(btnCanel);
		
		 label = new JLabel("");
		label.setBounds(136, 121, 116, 16);
		frame.getContentPane().add(label);
		label.setVisible(false);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{ 
		  if(e.getActionCommand()=="Login")
		  {  try{
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logincovid?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","141225514Left");
			  System.out.print("done");
			  String str1 = txtUsername.getText();

		        char[] p = passwordField.getPassword();
		        String str2 = new String(p);
			  PreparedStatement ps = con.prepareStatement("select *FROM LOG  where login=? and  password=?");
			    ps.setString(1, str1);

	            ps.setString(2, str2);
                ResultSet rs = ps.executeQuery();
	            if(rs.next())
	            {
	            	JOptionPane.showMessageDialog(passwordField, "Login Successful ",rs.getString(1),JOptionPane.INFORMATION_MESSAGE);
	            	if(txtUsername.getText().length()>=5&&passwordField.getText().length()>=5) 
	    			{ /*btnNewButton.setVisible(false);  
	                txtUsername.setVisible(false);
	                passwordField.setVisible(false);
	                lblNewLabel.setVisible(false);
	                lblPassword.setVisible(false);
	                lblPassword.setVisible(false);
	                btnCanel.setVisible(false);
	                btnNewButton_1.setVisible(false);
	                label.setVisible(false);
	                */
	            	secondframe sf=new secondframe();
	            	sf.setVisible(true);
	            	try {
	            		  Desktop desktop = java.awt.Desktop.getDesktop();
	            		  URI oURL = new URI("http://www.google.com");
	            		  desktop.browse(oURL);
	            		} catch (Exception f) {
	            		  f.printStackTrace();
	            		}
	               // JOptionPane.showMessageDialog(passwordField, "Login Successful","logged in",JOptionPane.INFORMATION_MESSAGE);
	                
	    			}
	            }
	            	 else
	    			 {
	    				 
	    					 if(txtUsername.getText().length()<5)
	    					 { txtUsername.requestFocus();
	    					 //JOptionPane.showMessageDialog(txtUsername, "UERSNAME LENGTH MUST BE GRATER THE 5");
	    					 JOptionPane.showMessageDialog(txtUsername, "USERNAME LENGTH MUST BE GRATER THE 4",  "ERROR", JOptionPane.ERROR_MESSAGE); 
	    					 label.setText("Invalid UserName");
	    					 label.setVisible(true);
	    					 }
	    					 else if(passwordField.getText().length()<5)
	    					 { passwordField.requestFocus();
	    					 //JOptionPane.showMessageDialog(txtUsername, "PASSWORD LENGTH MUST BE GRATER THE 5");
	    					 JOptionPane.showMessageDialog(passwordField, "PASSWORD LENGTH MUST BE GRATER THE 4",  "ERROR", JOptionPane.ERROR_MESSAGE);
	    					 label.setText("Invalid Password");
	    					 label.setVisible(true);
	    					 }
	    					 else
	    					 {
	    						 JOptionPane.showMessageDialog(passwordField, "Invalid Username or Password",  "ERROR", JOptionPane.ERROR_MESSAGE); 
	    					 }
	    			 }
	    		  }	
		  catch(Exception sq)
		  {
			  sq.printStackTrace();
		  }
		  }
			
		  else
		  {
			  txtUsername.setText("");
			  passwordField.setText("");
			  label.setText(null);
		  }
		  
	}
}
