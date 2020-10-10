/**
 * 
 */
package swingGui;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class ComboBox implements ActionListener 
{
     JFrame frame;
     JComboBox <String>cb;
     JLabel label;
     JRadioButton male,female;
     ButtonGroup gender;
	public ComboBox() 
	{
      frame=new JFrame("main frame");
      cb =new JComboBox<String>();
      add();
	}

	private void add()
	{
		frame.setBounds(0,0,500,500);
		frame.setLayout(null);
		
		frame.setBackground(Color.CYAN); //must use .getContentPane()
		frame.getContentPane().setBackground(Color.CYAN);
		label=new JLabel("name");
		label.setBounds(250,250,150,50);
		label.setText("ComboBox ");
		frame.add(label);
		cb.addItem("TN");
		cb.addItem("ap");
		cb.setBounds(50,50,100,100);
		cb.setBackground(Color.green);
	    frame.add(cb);
	    male=new JRadioButton("male",true);
	    male.setText("MALE");
	    male.setBackground(Color.red);
	    male.setBounds(150,330,120,50);
	    female=new JRadioButton("Female");
	    
	    female.setText("Female");
	    female.setBounds(300,100,150,100);
	    frame.add(male);
	    frame.add(female);
	    gender =new ButtonGroup();
	    gender.add(male);
	    gender.add(female);
	    DefaultListModel<String> dlist=new DefaultListModel();
	    dlist.addElement("Java");
	    dlist.addElement("c++");
	    JList<String>list=new JList<>(dlist);
	    list.setBounds(50,150,200,130);
	     frame.add(list);
	     list.setBackground(Color.ORANGE);
	    //list.add("java"); error
	    
	    frame.setVisible(true);
	}


	public static void main(String[] args) 
	{
       new ComboBox();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
