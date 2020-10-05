/**
 * 
 */
package Random.coder.util;
import java.sql.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class database 
{

	public database()
	{
      
	}
	
    public static Connection getDBConnect()
    {  Connection con=null;
        try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://192.168.15.219:3306/logincovid?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			try {
				con=DriverManager.getConnection(url,"newnav","141225514");
				if(con!=null)
				{	System.out.println("connected");
				
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    	return con;
    }
}
