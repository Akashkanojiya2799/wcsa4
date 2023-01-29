package testNGParallelExecution;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjectModel.BaseTest;

public class TestingMethodClass3 extends BaseTest{
	
	@Test
  	public void m1() throws IOException 
	{
		openBrowser();
		Reporter.log("m1",true);
	}
	
	@Test
  	public void m2() throws IOException 
	{
		openBrowser();
		Reporter.log("m2",true);
	}
}
