/**
 * 
 */
package swingGui;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Main {
    private static JFrame mainFrame = new JFrame();
    private static JPanel mainPane = new JPanel();
    public Main(){}

    public static void initGui(){
        JLayeredPane westPanel = new JLayeredPane();
        westPanel.setLayout(null);
        westPanel.setPreferredSize(new Dimension(200,0));
        westPanel.setBackground(Color.MAGENTA);

        JPanel layerOne = new JPanel();
        layerOne.add(new JLabel("This is layer 1"));
        layerOne.setBounds(0, 0, 100, 100);
        westPanel.add(layerOne, new Integer(0), 0);

        JPanel layerTwo = new JPanel();
        layerTwo.add(new JLabel("This si layer 2"));
        layerTwo.setBounds(0, 100, 100, 100);
        westPanel.add(layerTwo, new Integer(1), 0);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.yellow);

        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(200,0));
        eastPanel.setBackground(Color.red);

        mainPane = new JPanel();
        mainPane.setLayout(new BorderLayout());
        mainPane.add(westPanel, BorderLayout.WEST);
        mainPane.add(centerPanel, BorderLayout.CENTER);
        mainPane.add(eastPanel, BorderLayout.EAST);

        mainFrame = new JFrame("Learning to use JLayeredPane");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(200, 200, 800, 500);
        mainFrame.setContentPane(mainPane);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        initGui();
    }
}