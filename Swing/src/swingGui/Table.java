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
public class Table 
{
    JFrame frame;
    
    JScrollPane sp;
	public Table()
	{
      frame=new JFrame("TABEL");
      frame.getContentPane().setBackground(Color.MAGENTA);
      frame.setBounds(0,0,700,700);
      frame.setLayout(new FlowLayout());
     // frame.setLayout(null); error
   
      String str[][]={{"101","RED"},{"102","WHITE"},{"103","BLACK"}};
      String col[]={"ID","NAME"};
      JTable table=new JTable(str,col);
      table.setBounds(10,10,250,250);
      frame.getContentPane().add(table);
      sp=new JScrollPane(table);
      sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      frame.getContentPane().add(sp);
      frame.setVisible(true);
      
	}

	public static void main(String[] args) 
	{

   new Table();
	}

}
