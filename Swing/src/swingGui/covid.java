/**
 * 
 */
package swingGui;
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class covid implements ActionListener{

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;
    private JButton btnNewButton ;
    private JLabel lblNewLabel;
    private 	JLabel lblPassword;
    private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					covid window = new covid();
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
	public covid() {
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
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\download_1_161x41.png"));
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
		btnNewButton_1.setBounds(96, 150, 96, 31);
		btnNewButton_1.addActionListener(this);
		frame.getContentPane().add(btnNewButton_1);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{ 
		  if(e.getActionCommand().equalsIgnoreCase("Login"))
		  { 
			 if(txtUsername.getText().length()>=5&&passwordField.getText().length()>=5) 
			{btnNewButton.setVisible(false);  
            txtUsername.setVisible(false);
            passwordField.setVisible(false);
            lblNewLabel.setVisible(false);
            lblPassword.setVisible(false);
            lblPassword.setVisible(false);
            JOptionPane.showMessageDialog(lblNewLabel, "Login Successful","logged in",JOptionPane.INFORMATION_MESSAGE);
			}
			 else
			 {
				 
					 if(txtUsername.getText().length()<5)
					 { txtUsername.requestFocus();
					 //JOptionPane.showMessageDialog(txtUsername, "UERSNAME LENGTH MUST BE GRATER THE 5");
					 JOptionPane.showMessageDialog(txtUsername, "USERNAME LENGTH MUST BE GRATER THE 4",  "ERROR", JOptionPane.ERROR_MESSAGE); 
					 }
					 else
					 { passwordField.requestFocus();
					 txtUsername.requestFocus();
					 //JOptionPane.showMessageDialog(txtUsername, "PASSWORD LENGTH MUST BE GRATER THE 5");
					 JOptionPane.showMessageDialog(txtUsername, "PASSWORD LENGTH MUST BE GRATER THE 4",  "ERROR", JOptionPane.ERROR_MESSAGE);
					 }
			 }
		  }	
	}
}
