/**
 * 
 */
package swingGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Event {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event window = new Event();
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
	public Event() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(36, 44, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(36, 77, 73, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(36, 116, 73, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(178, 38, 214, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 75, 214, 26);
		frame.getContentPane().add(passwordField);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(178, 114, 214, 138);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("State");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(36, 286, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AP", "TN", "DELHI"}));
		comboBox.setBounds(178, 284, 214, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(36, 337, 73, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(184, 334, 78, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(283, 334, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup gender =new ButtonGroup();
		gender.add(rdbtnNewRadioButton);
		gender.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cricket");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(178, 377, 92, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_5 = new JLabel("Hobbies");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(36, 381, 73, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Reading");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(279, 377, 113, 25);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Java", "C++", "Ml", "Python", "Opencv"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(178, 432, 214, 107);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_6 = new JLabel("Skills");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(36, 433, 73, 16);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
