package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag3 {
	
	@Test(groups = "Functional")
	public void test31() 
	{
		Reporter.log("Functional Testing", true);
	}
	
	@Test(groups = "Integration")
	public void test32()
	{
		Reporter.log("Integration Testing", true);
	}
	
	@Test(groups = "System")
	public void test33()
	{
		Reporter.log("System Testing", true);
	}
}
