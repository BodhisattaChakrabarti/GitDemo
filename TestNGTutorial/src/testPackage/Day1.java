package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test(groups= {"smoke"})
	public void demo()
	{
		System.out.println("Welcome to Nordics");
	}
	
	@Test
	public void secondDemo()
	{
		System.out.println("Welcome to Germania");
		Assert.assertFalse(true);
	}
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("Leaving Pax Romana");
	}
}
