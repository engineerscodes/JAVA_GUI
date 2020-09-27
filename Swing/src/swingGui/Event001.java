/**
 * 
 */
package swingGui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Event001  implements ActionListener
{
    JFrame f;
    JButton b;
    JLabel l;
	public Event001() 
	{
	  f= new JFrame("RANDOM CODER'S");
      f.setBounds(0, 0, 500, 500);
      f.setLayout(null);
      b=new JButton();
      b.setText("Click");
      b.setBounds(250, 250,150,50);
      f.add(b);
      b.addActionListener(this);
      
      l=new JLabel();
      l.setText("TEXT");
      l.setBounds(100,150,150,200);
      f.add(l);
      f.setVisible(true);
	}

	public static void main(String[] args) 
	{
      new Event001() ;

	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		f.setLayout(null);
		b.setVisible(false);
		l.setText("null");
		
		
	}

}
