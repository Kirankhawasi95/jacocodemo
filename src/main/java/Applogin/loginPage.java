package Applogin;

public class loginPage {
	
	
	public static boolean login(String user, String Psw)
	{
	boolean login_status=true;
	
		if(user.equals("admin") && Psw.equals("admin"))
		{
			login_status=true;
		}
		else if(user.equals("admin") && !Psw.equals("admin"))
		{
			login_status=false;
		}
		
		return login_status;
		
	}

}
