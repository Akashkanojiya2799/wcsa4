package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag2 {
	
	@Test(groups = "Functional")
	public void test21() 
	{
		Reporter.log("Functional Testing",true);
	}
	
	@Test(groups = "Integration")
	public void test22()
	{
		Reporter.log("Integration Testing", true);
	}
	
	@Test(groups = "System")
	public void test23()
	{
		Reporter.log("System Testing", true);
	}
}
