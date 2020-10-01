/**
 * 
 */
package Random.coder.service;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import Random.coder.dao.dbOperations;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class resetFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resetFrame frame = new resetFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public resetFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Username");
		lblNewLabel.setBounds(12, 80, 98, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Password");
		lblNewLabel_1.setBounds(12, 118, 98, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(136, 77, 161, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dbOperations db=new dbOperations();
				db.update(new gui().user.getText(),new gui().pass.getText(),textField.getText(),passwordField.getText() );
				JOptionPane.showMessageDialog(passwordField,"Rest Successful");
				JComponent c=(JComponent)e.getSource();
				Window win=SwingUtilities.getWindowAncestor(c);
				win.dispose();
				new gui().frame.setVisible(true);
				//System.out.print(textField.getText());
			}
		});
		btnNewButton.setBounds(162, 169, 97, 25);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(136, 112, 161, 25);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\download_1_420x67.jpg"));
		lblNewLabel_2.setBounds(0, 0, 420, 67);
		contentPane.add(lblNewLabel_2);
	}
}
