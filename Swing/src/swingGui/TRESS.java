/**
 * 
 */
package swingGui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class TRESS {
	JFrame  frame;
	JTree tree,tree2;
	public TRESS() 
	{
		frame=new JFrame("Tree");
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setLayout(null);
		frame.setBounds(50,50,700,700);
		DefaultMutableTreeNode t=new  DefaultMutableTreeNode("red");
		DefaultMutableTreeNode t1=new DefaultMutableTreeNode("blue");
		t.add(t1);
        tree=new JTree(t);
        tree.setBounds(10,10,100,100);
        frame.add(tree);
        tree2=new JTree();//there are element bi-default;
        tree2.setBounds(130,130,200,200);
        frame.add(tree2);
       // JScrollPane sb=new JScrollPane(tree);
       // sb.setBounds(250,250,, height);
       // frame.add(sb)
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
         new TRESS();
	}

}
