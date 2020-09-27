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
	{
		b1=new 	Button("Button...");
		b1.setBounds(50,50,100,80); //error position not channing
		add(b1);
		setSize(500,500);
		setTitle("Simple GUI DEMO");
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String ...strings)
	{
		new layout();
	}
}
