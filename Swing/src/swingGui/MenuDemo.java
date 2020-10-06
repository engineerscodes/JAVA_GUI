/**
 * 
 */
package swingGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class MenuDemo {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDemo window = new MenuDemo();
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
	public MenuDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setForeground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 460, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 128));
		menuBar.setForeground(new Color(0, 0, 255));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Files");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		buttonGroup.add(mnNewMenu);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("save");
		mntmNewMenuItem.setBackground(new Color(0, 128, 128));
		mntmNewMenuItem.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 18));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mntmNewMenuItem_1.setBackground(new Color(0, 128, 128));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
