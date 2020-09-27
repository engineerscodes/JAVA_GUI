/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
package AWT;

import java.awt.*;

public class layout extends Frame
{
	Button b1;
	layout()
	{    setSize(500,500);
	     setTitle("Simple GUI DEMO");
	     setLayout(new FlowLayout());
	    // setBounds(500,500,30,30);
	     setLayout(null);
	   
		b1=new 	Button("Button...");
		b1.setBounds(50,50,100,80); //error position not channing
	
		b1.setLocation(250,250);
		add(b1);
		setLayout(null);
		
		setVisible(true);
	}
	public static void main(String ...strings)
	{
		new layout();
	}
}
