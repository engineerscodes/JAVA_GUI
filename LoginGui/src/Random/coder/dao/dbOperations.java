/**
 * 
 */
package Random.coder.dao;

import Random.coder.util.database;
import Random.coder.bean.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class dbOperations
{
	Connection con=null;
	Statement st;
	public dbOperations() 
	{ 
      con= database.getDBConnect();
	}
	public void CreateTable()
	{
	  // call once only	
	}
	public void DeleteTable()
	{
		//not needed
	}
	public void InsertedValue()
	{
		
	}
	public void update()
	{
		
	}
	public void delete()
	{
		
	}
	public ArrayList <userDB_bean> retrive()
	{   ArrayList <userDB_bean>  list=new ArrayList();
		try {
		st=con.createStatement();
		String command="select *from LOG";
		ResultSet rs=st.executeQuery(command);
		/*while(rs.next())
		{
			System.out.println("UserName :"+rs.getString(1));
			System.out.println("Password :"+rs.getString(2));
		}
		*/
		//ArrayList <userDB_bean>  list=new ArrayList(); its inside try
		while(rs.next())
		{
			userDB_bean user=new userDB_bean();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			list.add(user);
		}
	} catch (SQLException e) {
		
		System.out.println("Error in dbopration retrive");
		
	}
	
		return list;	
	}
	

}
