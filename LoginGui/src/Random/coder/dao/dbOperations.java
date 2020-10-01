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
	public int InsertedValue(String Username,String Pass)
	{    int res=-1;
		try {
			st=con.createStatement();
			String str=String.format("INSERT INTO LOG(login,password) VALUES('%s','%s')",Username,Pass);
			//String command="INSERT INTO TABLE_NAME VALUES ;
		res=st.executeUpdate(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*
 * When the method execute returns true, 
 * the method getResultSet is called to retrieve the ResultSet object. 
 * When execute returns false, the method getUpdateCount returns an int. 
 * If this number is greater than or equal to zero, it indicates the update count returned by the statement. 
 * If it is -1, it indicates that there are no more results.
 */
	return res;	
	}
	public int update(String username,String password,String newuser,String newpass)
	{
		int res=-1;
		try {
			st=con.createStatement();
			String sql=String.format("update log  set login='%s' ,password='%s' Where login='%s' and password='%s'",newuser,newpass,username,password);
			res=st.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
	}
	public int delete(String username,String password)
	{  int res=-1;
		try {
			st=con.createStatement();
			String sql=String.format("Delete from log where login='%s' and password='%s'",username,password);
			res=st.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
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
