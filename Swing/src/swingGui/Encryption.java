/**
 * 
 */
package swingGui;
//import Traditional_Ciphers.Substitution_Ciphers;
import java.awt.EventQueue;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Encryption {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encryption window = new Encryption();
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
	public Encryption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(193, 41, 380, 144);
		frame.getContentPane().add(textArea);
		JLabel lblNewLabel_1 = new JLabel("Key");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		lblNewLabel_1.setBounds(36, 187, 96, 21);
		frame.getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel = new JLabel("Encryption");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 43, 139, 96);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(193, 253, 380, 169);
		frame.getContentPane().add(textArea_1);
		
		textField = new JTextField();
		textField.setBounds(36, 213, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Encryption");
		btnNewButton.setBounds(193, 212, 133, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						Additve_Cipher  ac=new Additve_Cipher();
						System.out.println();
						String s=ac.encryption(textArea.getText().toUpperCase(),Integer.parseInt(textField.getText()));
						textArea_1.setText(s);
						
					}
			
				});
		JButton btnDecryption = new JButton("Decryption");
		btnDecryption.setBounds(393, 212, 154, 21);
		frame.getContentPane().add(btnDecryption);
		
		btnDecryption.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Additve_Cipher  ac=new Additve_Cipher();
				String s=ac.decryption2(textArea_1.getText(),Integer.parseInt(textField.getText()));
				textArea_1.setText(s);
			}
			
		});
		
		
	}
}

