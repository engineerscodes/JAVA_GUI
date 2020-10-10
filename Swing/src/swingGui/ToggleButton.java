/**
 * 
 */
package swingGui;
import 	javax.swing.*;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class ToggleButton implements ItemListener
{
    JFrame  frame;
    JToggleButton tg;
	public ToggleButton() 
	{
		frame=new JFrame("TOGGLEBUTTON");
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setLayout(new FlowLayout());
		frame.setBounds(50,50,700,700);
		
		tg=new JToggleButton("button");
		tg.setBounds(100,100, 50,50);
		frame.add(tg);
		tg.addItemListener(this);
		frame.setVisible(true);
	}

	public static void main(String[] args) 
	{
         new ToggleButton();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(tg.isSelected())
		   tg.setText("ON");
		else
			tg.setText("OFF");
	}

}
