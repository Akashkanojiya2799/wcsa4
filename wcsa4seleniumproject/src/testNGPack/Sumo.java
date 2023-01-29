package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	
	@Test
	public void sumo()
	{
		Reporter.log("This is the method of sumo", true);
	}
	
	@Test
	public void sumo1()
	{
		Reporter.log("This is the method of sumo1", true);
	}
	
	@Test
	public void sumo2()
	{
		Reporter.log("This is the method of sumo2", true);
	}
}
