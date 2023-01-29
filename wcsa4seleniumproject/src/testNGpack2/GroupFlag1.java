package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag1 {
	
	@Test(groups = "Functional")
	public void test111() 
	{
		Reporter.log("Functional Testing", true);
	}
	
	@Test(groups = "Integration")
	public void test12()
	{
		Reporter.log("Integration Testing", true);
	}
	
	@Test(groups = "System")
	public void test13()
	{
		Reporter.log("System Testing", true);
	}
}
