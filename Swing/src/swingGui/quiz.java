/**
 * 
 */
package swingGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class quiz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz window = new quiz();
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
	public quiz() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 432, 27);
		frame.getContentPane().add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.RED);
		layeredPane.setBounds(0, 40, 432, 213);
		frame.getContentPane().add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 13, 432, 200);
		layeredPane.add(panel_1);
		frame.setVisible(true);
		
	}
}
