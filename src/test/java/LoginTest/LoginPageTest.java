package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Applogin.loginPage;

public class LoginPageTest {
	

	loginPage Applogin= new loginPage();
	
	@Test
	void login_test1()
	{
		boolean status=loginPage.login("admin", "admin");
		Assert.assertEquals(status, true);
	}
			
	@Test
	void login_test2()
	{
		boolean status=loginPage.login("admin123", "admin123");
		Assert.assertEquals(status, true);
	}

}
