package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7_Group {
	
	@Test(groups = "functional")
	public void ft1() 
	{
		Reporter.log("Functional Testing 1", true);
	}
	
	@Test(groups = "integration")
	public void it1()
	{
		Reporter.log("Integration Testing 1", true);
	}
	
	@Test(groups = "system")
	public void st1()
	{
		Reporter.log("System Testing 1", true);
	}

//------------------------------------------------------------------------------------	
	
	@Test(groups = "functional")
	public void ft2()
	{
		Reporter.log("Functional Testing 2", true);
	}
	
	@Test(groups = "integration")
	public void it2()
	{
		Reporter.log("Integration Testing 2", true);
	}
	
	@Test(groups = "system")
	public void st2()
	{
		Reporter.log("System Testing 2", true);
	}
		
//-------------------------------------------------------------------------------------
	
	@Test(groups = "functional")
	public void ft3()
	{
		Reporter.log("Functional Testing 3", true);
	}
	
	@Test(groups = "integration")
	public void it3()
	{
		Reporter.log("Integration Testing 3", true);
	}
	
	@Test(groups = "system")
	public void st3()
	{
		Reporter.log("System Testing 3", true);
	}
}
