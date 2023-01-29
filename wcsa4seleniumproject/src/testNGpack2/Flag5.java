package testNGpack2;

import org.testng.annotations.Test;

public class Flag5 {
	
	@Test(priority = 2)
	public void a() 
	{
		System.out.println("a");
	}
	
	@Test(priority = 2)
	public void b()
	{
		System.out.println("b");
	}
	
	@Test(priority = 1)
	public void c()
	{
		System.out.println("c");
	}
	
	@Test
	public void d()
	{
		System.out.println("d");
	}
	
	@Test(priority = 0)
	public void e()
	{
		System.out.println("e");
	}
	
	@Test(priority = -2)
	public void f()
	{
		System.out.println("f");
	}
	
	@Test(priority = -3)
	public void g()
	{
		System.out.println("g");
	}
}
// priority flag
