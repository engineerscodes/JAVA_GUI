/**
 * 
 */
package Random.coder.bean;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class userDB_bean {
    private String username,password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public userDB_bean() 
	{
		username=password=null;
	}

}
