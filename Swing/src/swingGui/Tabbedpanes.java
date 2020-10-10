/**
 * 
 */
package swingGui;
import java.awt.*;
import javax.swing.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Tabbedpanes {
    JFrame frame;
    JTabbedPane tp;
    JPanel p1,p2,p3;
	public Tabbedpanes() 
	{
       frame =new JFrame("TABBEDPANE");
       frame.getContentPane().setBackground(Color.MAGENTA);
       frame.setBounds(0,0,700,700);
       frame.setLayout(null);
       p1=new JPanel();
       p1.setBackground(Color.RED);
       p2=new JPanel();
       p2.setBackground(Color.GREEN);
       p3=new JPanel();
       p3.setBackground(Color.BLACK);
      // p3.setBounds(0, 0, 400, 500); overidden 
       tp=new JTabbedPane();
       tp.add("RED",p1);
       tp.add("Green",p2);
       tp.add("Black",p3);
       tp.setBounds(50,50,300,300);
        frame.add(tp);
       frame.setVisible(true);
       
	}

	public static void main(String[] args) 
	{
        new Tabbedpanes();
	}

}
