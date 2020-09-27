/**
 * 
 */
package swingGui;
import javax.swing.*;
import java.awt.Dimension;
public class dem02 
{
    JFrame f;
   
	public dem02() 
	{
        f=new JFrame();
        f.setTitle("RANDOM CODER'S");
        f.setLayout(null);
        JLabel  L=new JLabel("Nothing");
       // L.setBounds(250, 250, 50, 50)
         L.setBounds(250, 150, 100,100);
         //L.setLayout(null);
        f.add(L);
        f.setSize(500,500);
       
        f.setVisible(true);
      
	}

	public static void main(String[] args) 
	{
		new dem02() ;
	}

}
