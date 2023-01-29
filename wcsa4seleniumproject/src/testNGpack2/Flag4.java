package testNGpack2;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	static WebDriver driver;
		
	@Test
	public void login()
	{
		Reporter.log("This is login", true);
	}
	
	
	@Test(dependsOnMethods = "logout")
	public void createUser()
	{
		Reporter.log("This is createUser", true);
	}
	
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("This is logout", true);
	}
}
