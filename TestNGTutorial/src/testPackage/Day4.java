package testPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters({"URL", "APIKey/username"})
	@Test
	public void webLoginHomeLoan(String urlName, String username)
	{
		System.out.println("Welcome to Asia");
		System.out.println(urlName);
		System.out.println(username);
	}
	
	@Test(groups= {"smoke"})
	public void mobileLoginHomeLoan()
	{
		System.out.println("Welcome to Gaul");
	}
	
	@Test(enabled=false)
	public void loginAPIHomeLoan()
	{
		System.out.println("Welcome to Egyptia");
	}
	
	@AfterSuite
	public void lastCenturion()
	{
		System.out.println("Last man standing");
	}
}
