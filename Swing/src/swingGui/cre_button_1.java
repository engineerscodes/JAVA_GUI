/**
 * 
 */
package swingGui;
import javax.swing.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class cre_button_1 
{
    JButton b1;
    JFrame f;
	public cre_button_1() 
	{  f=new JFrame();
       b1=new JButton ();  
	}

	public void build() 
	{
		b1.setBounds(150,150,150,50);
		f.setLayout(null);
		f.add(b1);
		b1.setText("hello");
		b1.setText("Button");
		f.setTitle("RANDOM CODER'S");
		f.setSize(500,500);
		
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
         new cre_button_1().build();
         
	}

}
