/**
 * 
 */
package swingGui;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Jpanel 
{
    JFrame frame;
    JPanel panel,panel2;
    JButton login,cancel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_2;
    
	public Jpanel() 
	{
         frame=new JFrame("new frame");
         panel=new JPanel();
         panel2=new JPanel();
         panel2.setBackground(new Color(255, 255, 0));
         
	}
	public void build()
	{
		frame.setBounds(0,0, 500, 500);
		frame.getContentPane().setLayout(null);//frame will ge at 0,0 and h=500,w=500
		panel.setBounds(0,0,482,453);
		panel.setBackground(Color.CYAN);
		panel.setLayout(null);
		login=new JButton("Login");
		panel2.setVisible(false);
		frame.getContentPane().add(panel2);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{   panel.setVisible(false);
		       	//panel2.setVisible(true);
			   	panel2.setBackground(Color.MAGENTA);
			   	panel2.setBounds(0,0,482,453);
			   	panel2.setLayout(null);
			   	panel2.setVisible(true);
			   	lblNewLabel_2 = new JLabel("New label");
				lblNewLabel_2.setBounds(125, 113, 56, 16);
				lblNewLabel_2.setText(textField.getText());
				panel2.add(lblNewLabel_2);
			   	
			}
		});
		login.setText("Login");
		login.setBounds(261,373,95, 30);
		panel.add(login);
		cancel=new JButton("Cancel");
		cancel.setBounds(130,373, 95,30);
		cancel.setText("Cancel");
		panel.add(cancel);
		
		//panel.setVisible(true);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 89, 78, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(115, 142, 78, 16);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(240, 86, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(240, 139, 116, 22);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(12, 211, 458, 149);
		panel.add(panel_1);
		
		
		
		frame.setVisible(true);
		
	}
public static void main(String ...arg)
{
	new Jpanel().build();
	
}
}
