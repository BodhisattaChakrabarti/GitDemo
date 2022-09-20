package testPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@BeforeTest
	public void preRequisite()
	{
		System.out.println("Legion marching to Britannia");
	}
	
	@Test(groups= {"smoke"})
	public void pLoan()
	{
		System.out.println("Welcome to Britannia");
		System.out.println("Welcome to Britain");
		System.out.println("Welcome to England");
		System.out.println("Welcome to Wales");
	}
	
	@AfterMethod
	public void afterEveryMethod()
	{
		System.out.println("Leaving gates...");
	}
}
