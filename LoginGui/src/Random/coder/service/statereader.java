/**
 * 
 */
package Random.coder.service;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

import javax.swing.JFrame;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class statereader 
{

	public static void main(String[] args) 
	{
		try {
		   FileInputStream f=new FileInputStream("output.ser");
		   ObjectInputStream obj=new ObjectInputStream(f); 
		   JFrame frame=(JFrame)obj.readObject();
		   Secondframe sf=(Secondframe)obj.readObject();
		   frame.setTitle("Serialzed Jframe");
		   frame.show();
		   
		   obj.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

