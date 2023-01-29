package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
  	public void demo() 
	{
		Reporter.log("This is the method from Demo", true);
	}
	
	@Test
	public void demo1()
	{
		Reporter.log("This is the method from Demo1", true);
	}
	
	@Test
	public void demo2()
	{
		int a= 10;
		int b=2;
		int res = a/b;
		
		Reporter.log("This is the method from Demo2", true);
	}
}
