/**
 * 
 */
package Random.coder.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComponent;

import Random.coder.dao.dbOperations;
import java.awt.Color;
import java.awt.Font;


/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Secondframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secondframe frame = new Secondframe();
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
	public Secondframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(294, 0, 138, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JComponent jc=(JComponent) e.getSource();
				Window win=SwingUtilities.getWindowAncestor(jc);
				win.dispose();
				gui g=new gui();
				g.frame.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset Password");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				resetFrame rf=new resetFrame();
				JComponent jc=(JComponent) e.getSource();
				Window win=SwingUtilities.getWindowAncestor(jc);
				win.dispose();
				rf.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(294, 33, 139, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deactivate");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dbOperations db=new dbOperations();
                System.out.println(new gui().user.getText());
                db.delete(new gui().user.getText(),new gui().pass.getText());
                JComponent jc=(JComponent) e.getSource();
				Window win=SwingUtilities.getWindowAncestor(jc);
				win.dispose();
				gui g=new gui();
				g.frame.setVisible(true);
                
			}
		});
		btnNewButton_2.setBounds(294, 65, 138, 25);
		contentPane.add(btnNewButton_2);
	}
}
